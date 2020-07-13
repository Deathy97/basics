package es.rafa.cmstraining.service.userService;

import es.rafa.cmstraining.dto.UserDTO;
import es.rafa.cmstraining.mapper.UserMapper;
import es.rafa.cmstraining.myBatisMapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    @Autowired
    private Mapper databaseMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDTO> getAllUsers() {

        return databaseMapper.getAllUsers().stream().map(userMapper::toDTO).collect(Collectors.toList());
    }
}

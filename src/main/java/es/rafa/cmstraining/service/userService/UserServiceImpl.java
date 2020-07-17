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

    @Override
    public Integer addUser(UserDTO user) {
        return databaseMapper.insertUser(userMapper.toDAO(user));
    }

    @Override
    public UserDTO getUserById(Long id) {
        return userMapper.toDTO(databaseMapper.getUserById(id));
    }

    @Override
    public Integer updateUser(UserDTO user) {
        return databaseMapper.updateUser(userMapper.toDAO(user));
    }
}

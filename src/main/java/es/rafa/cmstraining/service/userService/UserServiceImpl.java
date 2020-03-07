package es.rafa.cmstraining.service.userService;

import es.rafa.cmstraining.dto.UserDTO;
import es.rafa.cmstraining.myBatisMapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private Mapper userMapper;

    @Override
    public List<UserDTO> getAllUsers() {
        return userMapper.getAllUsers();
    }
}

package es.rafa.cmstraining.service.userService;

import es.rafa.cmstraining.dto.UserDTO;

import java.util.List;

public interface UserService {

    public List<UserDTO> getAllUsers();

    public Integer addUser(UserDTO user);

    UserDTO getUserById(Long id);

    Integer updateUser(UserDTO user);
}

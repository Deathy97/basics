package es.rafa.cmstraining.mapper;

import es.rafa.cmstraining.DAO.UserDAO;
import es.rafa.cmstraining.dto.UserDTO;

public class UserMapper {
    public UserDAO toDAO(UserDTO user) {
        UserDAO userDAO = new UserDAO();
        userDAO.setId(user.getId());
        userDAO.setName(user.getName());
        userDAO.setLastName(user.getLastName());

        return userDAO;
    }

    public UserDTO toDTO(UserDAO userDAO) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userDAO.getId());
        userDTO.setName(userDAO.getName());
        userDTO.setLastName(userDAO.getLastName());

        return userDTO;

    }
}
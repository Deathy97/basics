package es.rafa.cmstraining.myBatisMapper;

import es.rafa.cmstraining.dto.UserDTO;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

    List<UserDTO> getAllUsers();
}

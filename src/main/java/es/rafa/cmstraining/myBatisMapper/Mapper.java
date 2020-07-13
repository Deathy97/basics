package es.rafa.cmstraining.myBatisMapper;

import es.rafa.cmstraining.DAO.UserDAO;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

    List<UserDAO> getAllUsers();
}

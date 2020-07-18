package es.rafa.cmstraining.service.clientService;

import es.rafa.cmstraining.dto.clientDTO.ClientDTO;
import es.rafa.cmstraining.myBatisMapper.DbClientMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    @Autowired
    DbClientMapper dbClientMapper;


    @Override
    public List<ClientDTO> getAllClients() {
        return null;
    }

    @Override
    public ClientDTO getClientById(Long id) {
        return null;
    }

    @Override
    public Integer addClient(ClientDTO client) {
        return null;
    }

    @Override
    public Integer updateClient(ClientDTO client) {
        return null;
    }

    @Override
    public Integer deleteClient(Long id) {
        return null;
    }
}

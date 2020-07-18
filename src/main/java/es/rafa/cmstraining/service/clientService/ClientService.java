package es.rafa.cmstraining.service.clientService;

import es.rafa.cmstraining.dto.clientDTO.ClientDTO;

import java.util.List;

public interface ClientService {
    public List<ClientDTO> getAllClients();

    public ClientDTO getClientById(Long id);

    public Integer addClient(ClientDTO client);

    public Integer updateClient(ClientDTO client);

    public Integer deleteClient(Long id);
}

package es.rafa.cmstraining.controller;

import es.rafa.cmstraining.dto.clientDTO.ClientDTO;
import es.rafa.cmstraining.service.clientService.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/Clients")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/getAllClients")
    public ResponseEntity<List<ClientDTO>> getAllClients() {
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(clientService.getAllClients());
    }

    @GetMapping("/getClientById/{id}")
    public ResponseEntity<ClientDTO> getClientById(@PathVariable("id") Long id) {
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(clientService.getClientById(id));
    }

    @PostMapping("/addClient")
    public ResponseEntity<String> addClient(@RequestBody ClientDTO Client) {
        Integer id = clientService.addClient(Client);
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body("Client insertado correctamente");
    }

    @PutMapping("/updateClient")
    public ResponseEntity<String> updateClient(@RequestBody ClientDTO Client) {
        Integer update = clientService.updateClient(Client);
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body("Client actualizado correctamente");

    }

    @DeleteMapping("/deleteClient/{id}")
    public ResponseEntity<String> deleteClient(@PathVariable Long id) {
        Integer deleted = clientService.deleteClient(id);

        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body("Client borrado correctamente");
    }
}
package com.example.HelloEvents.Controller;

import com.example.HelloEvents.Dto.ClientDto;
import com.example.HelloEvents.Services.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")

public class ClientController {

    public ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping("/allClients")
    public List<ClientDto> getallClients(){
        return  clientService.getallClients();
    }
    @PostMapping("/addClient")
    public ClientDto addClient(@RequestBody ClientDto clientDto){
        return clientService.SaveClient(clientDto);
    }
    @GetMapping("/client/{id}")
    public ClientDto getClientById(@PathVariable Long id){
        return clientService.getClientByid(id);
    }
    @PutMapping("/client/{id}")
    public ClientDto updateClient(@PathVariable Long id , @RequestBody ClientDto clientDto){
        return clientService.modifierClient(id,clientDto);
    }
    @DeleteMapping("/client/{id}")
    public void deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
    }


}

package com.example.HelloEvents.Services;

import com.example.HelloEvents.Dto.ClientDto;
import com.example.HelloEvents.Mapper.ClientMapper;
import com.example.HelloEvents.Repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private ClientMapper clientMapper;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }


    public ClientDto SaveClient(ClientDto clientDto){
        return clientMapper.toClientDto(clientRepository.save(clientMapper.toCliententity(clientDto)));
    }

    public List<ClientDto> getallClients(){
        return clientRepository.findAll().stream()
                .map(client ->clientMapper.toClientDto(client)).toList();
    }

    public ClientDto getClientByid(Long id){
        return clientRepository.findById(id)
                .map(client -> clientMapper.toClientDto(client))
                .orElseThrow(()-> new RuntimeException("Client not found"));
    }

    public ClientDto modifierClient(Long id ,ClientDto clientDto){
        return clientRepository.findById(id).map(client -> {
            client.setFirstName(client.getFirstName());
            client.setLastName(client.getLastName());
            client.setEmail(client.getEmail());
            client.setPassword(client.getPassword());

            return clientMapper.toClientDto(clientRepository.save(client));


        }).orElseThrow(()-> new RuntimeException("Client not found"));
    }

    public void deleteClient(Long id){
         clientRepository.deleteById(id);
    }
}

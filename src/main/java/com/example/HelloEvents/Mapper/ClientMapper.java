package com.example.HelloEvents.Mapper;


import com.example.HelloEvents.Dto.ClientDto;
import com.example.HelloEvents.model.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    ClientDto toClientDto(Client client);
    Client toCliententity(ClientDto clientDto);

}

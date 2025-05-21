package com.example.HelloEvents.Mapper;


import com.example.HelloEvents.Dto.ClientDto;
import com.example.HelloEvents.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ClientMapper {

    ClientDto toClientDto(Client client);
    Client toCliententity(ClientDto clientDto);

}

package com.example.HelloEvents.Mapper;

import com.example.HelloEvents.Dto.EventDto;
import com.example.HelloEvents.model.Evenement;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {

    EventDto eventToDto(Evenement evenement);
    Evenement dtoToEvent(EventDto eventDto);
}

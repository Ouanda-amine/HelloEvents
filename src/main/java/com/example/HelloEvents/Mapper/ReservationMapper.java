package com.example.HelloEvents.Mapper;

import com.example.HelloEvents.Dto.ReservatioDto;
import com.example.HelloEvents.model.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" , unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ReservationMapper {

    //@Mapping(source = "idreservation", target = "idReservation")
    ReservatioDto reservationToDto(Reservation reservation);
    Reservation DtoToReservation(ReservatioDto dto);


}

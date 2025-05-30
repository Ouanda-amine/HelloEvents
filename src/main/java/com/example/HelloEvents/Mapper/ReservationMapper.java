package com.example.HelloEvents.Mapper;

import com.example.HelloEvents.Dto.ReservatioDto;
import com.example.HelloEvents.model.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" , unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ReservationMapper {

    @Mapping(source = "reservation.idreservation", target = "idReservation")
    @Mapping(source = "reservation.client.id", target = "clientid")
    @Mapping(source = "reservation.evenement.idEvent", target = "eventId")
    ReservatioDto reservationToDto(Reservation reservation);

    Reservation DtoToReservation(ReservatioDto dto);


}

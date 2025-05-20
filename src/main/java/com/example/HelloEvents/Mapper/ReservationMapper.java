package com.example.HelloEvents.Mapper;

import com.example.HelloEvents.Dto.ReservatioDto;
import com.example.HelloEvents.model.Reservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationMapper {
    ReservatioDto reservationToDto(Reservation reservation);
    Reservation DtoToReservation(ReservatioDto dto);


}

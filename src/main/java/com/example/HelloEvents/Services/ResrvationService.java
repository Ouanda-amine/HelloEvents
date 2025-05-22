package com.example.HelloEvents.Services;

import com.example.HelloEvents.Dto.ReservatioDto;
import com.example.HelloEvents.Mapper.ReservationMapper;
import com.example.HelloEvents.Repository.ClientRepository;
import com.example.HelloEvents.Repository.EventRepository;
import com.example.HelloEvents.Repository.ReservationRepository;
import com.example.HelloEvents.model.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ResrvationService {


    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;
    private final EventRepository eventRepository;
    private ReservationMapper reservationMapper;

    @Transactional
    public ReservatioDto Resrever(ReservatioDto reservatioDto){
        var client = clientRepository.findById(reservatioDto.getClientid()).orElse(null);
        var event = eventRepository.findById(reservatioDto.getEventId()).orElse(null);

        var res = reservationRepository.save(new Reservation(null,client,event));
        return new ReservatioDto(res.getIdreservation(), res.getClient().getId(), res.getEvenement().getIdEvent());
    }

    public List<ReservatioDto>  getAllReservation(){
        return reservationRepository.findAll().stream()
                .map(res->reservationMapper.reservationToDto(res))
                .toList();
    }

    public ReservatioDto getReservationById(Long id){
        return reservationRepository.findById(id)
                .map(ress->reservationMapper.reservationToDto(ress))
                .orElseThrow(()->new RuntimeException("Reservation Not Found"));
    }



}

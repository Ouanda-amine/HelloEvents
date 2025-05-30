package com.example.HelloEvents.Controller;

import com.example.HelloEvents.Dto.ReservatioDto;
import com.example.HelloEvents.Services.ResrvationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class ReservationController {

    public ResrvationService resrvationService;

    @PostMapping("/addReservation")
    public ReservatioDto addReservation(@RequestBody  ReservatioDto reservatioDto){
        return resrvationService.Resrever(reservatioDto);
    }

    @GetMapping("/allReservations")
    public List<ReservatioDto> getAllReservations(){
        return resrvationService.getAllReservation();
    }

    @GetMapping("/reservation/{id}")
    public ReservatioDto getreservationById(@PathVariable  Long id ){
        return resrvationService.getReservationById(id);
    }
}

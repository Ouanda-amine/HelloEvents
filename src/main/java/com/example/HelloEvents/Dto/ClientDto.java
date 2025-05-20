package com.example.HelloEvents.Dto;

import com.example.HelloEvents.model.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor


public class ClientDto {
    private Long idclient;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}

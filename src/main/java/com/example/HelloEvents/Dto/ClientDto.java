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
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}

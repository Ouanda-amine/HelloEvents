package com.example.HelloEvents.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EventDto {

    private Long idevent;
    private String eventname;
    private String description;
    private String type;
    private List<Long> reservationIds;
}

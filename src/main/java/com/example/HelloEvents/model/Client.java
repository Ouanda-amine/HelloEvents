package com.example.HelloEvents.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter  @Setter
public class Client extends User {

    public Client() {
        this.setRole(Role.CLIENT);
    }

    @OneToMany(mappedBy = "client" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Reservation> reservations;

}

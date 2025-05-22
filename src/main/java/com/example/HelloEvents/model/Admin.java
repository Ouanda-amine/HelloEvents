package com.example.HelloEvents.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Admin extends User {

    public Admin() {
        this.setRole(Role.ADMIN);
    }
}
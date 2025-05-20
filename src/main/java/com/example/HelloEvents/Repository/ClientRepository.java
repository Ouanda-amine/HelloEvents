package com.example.HelloEvents.Repository;

import com.example.HelloEvents.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}

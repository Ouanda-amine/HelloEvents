package com.example.HelloEvents.Repository;

import com.example.HelloEvents.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Evenement, Long> {
}

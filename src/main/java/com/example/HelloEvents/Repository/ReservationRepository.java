package com.example.HelloEvents.Repository;

import com.example.HelloEvents.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation , Long> {
}

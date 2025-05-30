package com.example.HelloEvents.Repository;

import com.example.HelloEvents.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReservationRepository extends JpaRepository<Reservation , Long> {
    @Query
    Integer countReservationByClient_Id(Long clientId);
}

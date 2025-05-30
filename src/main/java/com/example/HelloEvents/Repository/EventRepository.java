package com.example.HelloEvents.Repository;

import com.example.HelloEvents.Dto.Result;
import com.example.HelloEvents.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventRepository extends JpaRepository<Evenement, Long> {

    @Query(value =

            "select count(id_event) as nbr from evenement e inner join reservation r on r.evenement_id_event = e.id inner join client c  on c.id = r.client_id where c.id = ?", nativeQuery = true)
    Integer countEvenementByClient(Long id);

}

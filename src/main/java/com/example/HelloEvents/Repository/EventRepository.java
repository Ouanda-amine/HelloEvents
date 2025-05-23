package com.example.HelloEvents.Repository;

import com.example.HelloEvents.Dto.Result;
import com.example.HelloEvents.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EventRepository extends JpaRepository<Evenement, Long> {

    @Query(value = "select", nativeQuery = true)
    List<Result> findBy(Long id);

}

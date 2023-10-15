package com.example.firstproject.repository;

import com.example.firstproject.entities.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationRepository extends CrudRepository <Reservation,String> {
}

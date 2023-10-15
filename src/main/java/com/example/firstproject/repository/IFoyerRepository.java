package com.example.firstproject.repository;

import com.example.firstproject.entities.Foyer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFoyerRepository extends CrudRepository<Foyer,Long> {
    List<Foyer> findByCapaciteFoyerAndNomFoyer(Long c, String n);
}

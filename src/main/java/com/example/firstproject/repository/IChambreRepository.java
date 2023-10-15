package com.example.firstproject.repository;

import com.example.firstproject.entities.Chambre;
import com.example.firstproject.entities.ChambreType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IChambreRepository extends CrudRepository<Chambre,Long> {

    List<Chambre> findAllByChambreType(ChambreType tc);
}

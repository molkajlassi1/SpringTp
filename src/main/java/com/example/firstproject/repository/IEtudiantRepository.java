package com.example.firstproject.repository;

import com.example.firstproject.entities.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEtudiantRepository extends CrudRepository<Etudiant, Long> {
  List <Etudiant>findByNomEtLike(String nomet);

}

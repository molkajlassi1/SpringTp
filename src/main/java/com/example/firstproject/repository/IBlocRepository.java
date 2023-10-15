package com.example.firstproject.repository;

import com.example.firstproject.entities.Bloc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlocRepository extends CrudRepository <Bloc,Long> {
}

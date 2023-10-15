package com.example.firstproject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Foyer implements Serializable {

    @Id
    private  long id;

    private  String  nomFoyer;

    private long capaciteFoyer;

    @OneToOne
    @JoinColumn(name = "universite")
    private Universite universite;



}

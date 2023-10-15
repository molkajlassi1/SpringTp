package com.example.firstproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Chambre implements Serializable {
    @Id
    private  long id;

    private  int numchambre;
    @Enumerated(EnumType.STRING)
    private ChambreType chambreType;
    @ManyToOne
    private Bloc bloc;

    @ManyToOne
    private Reservation reservation;

    @ManyToMany(mappedBy = "chambres")
    private Set<Reservation> reservations;

}

package com.example.firstproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation implements Serializable {
    @Id
    private String id;
    @Temporal(TemporalType.DATE)
    private Date anneUniversitaire;
    private Boolean estValide;

    @ManyToMany
    @JoinTable(
            name = "reservation_chambre",
            joinColumns = @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "chambre_id")
    )
    private Set<Chambre> chambres;
}

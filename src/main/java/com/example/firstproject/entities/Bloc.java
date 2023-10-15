package com.example.firstproject.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bloc implements Serializable {

    @Id
    private long id;
    private String nomBloc;
    private  long capaciteBloc;
    @OneToMany (mappedBy="bloc")
    private List<Chambre> chambre;

    @ManyToOne
    private Foyer foyer;

}

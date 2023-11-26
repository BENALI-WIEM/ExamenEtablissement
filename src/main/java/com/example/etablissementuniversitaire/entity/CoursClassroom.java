package com.example.etablissementuniversitaire.entity;

import jakarta.persistence.*;
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
public class CoursClassroom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCours;
    private Specialite specialite;
    private String nom;
    private int nbHeures;
    private boolean archive;

    @ManyToOne
    private Classe classe;
}

package com.example.etablissementuniversitaire.entity;

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
public class Classe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codeClasse;
    private String titre;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @OneToMany(mappedBy = "classe")
    private Set<CoursClassroom> coursClassrooms;
}

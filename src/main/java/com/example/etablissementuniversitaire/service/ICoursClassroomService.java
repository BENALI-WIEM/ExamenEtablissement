package com.example.etablissementuniversitaire.service;

import com.example.etablissementuniversitaire.entity.CoursClassroom;
import com.example.etablissementuniversitaire.entity.Niveau;
import com.example.etablissementuniversitaire.entity.Specialite;
import org.springframework.stereotype.Service;


public interface ICoursClassroomService {
    CoursClassroom ajouterCoursClassroom(CoursClassroom cc, int codeClasse);
    void desaffecterCoursClassroomClasse(int idCours);
    void archiverCoursClassrooms();
    int nbHeuresParSpecEtNiv(Specialite specialite, Niveau niveau);
}

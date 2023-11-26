package com.example.etablissementuniversitaire.controller;

import com.example.etablissementuniversitaire.entity.Classe;
import com.example.etablissementuniversitaire.entity.CoursClassroom;
import com.example.etablissementuniversitaire.entity.Niveau;
import com.example.etablissementuniversitaire.entity.Utilisateur;
import com.example.etablissementuniversitaire.service.IClasseService;
import com.example.etablissementuniversitaire.service.ICoursClassroomService;
import com.example.etablissementuniversitaire.service.IUtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("")
public class ApplicationController {
     IClasseService classeService;
     ICoursClassroomService coursClassroomService;
     IUtilisateurService utilisateurService;

@PostMapping("/useradd")
    Utilisateur ajouterUse(Utilisateur utilisateur){
    return utilisateurService.ajouterUtilisateur(utilisateur);
}

@PostMapping("/addClasse")
    Classe ajouterClasse(Classe classe) {
        return classeService.ajouterClasse(classe);
    }

    @PutMapping("/archive")
    void archive() {
    coursClassroomService.archiverCoursClassrooms();
    }
    @GetMapping("/getniveau")
    int count(Niveau niveau){
        return utilisateurService.nbutilisateursParNiveau(niveau);
    }
}

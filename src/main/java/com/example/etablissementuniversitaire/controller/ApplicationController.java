package com.example.etablissementuniversitaire.controller;

import com.example.etablissementuniversitaire.entity.*;
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

@PostMapping("/addUser")
    Utilisateur ajouterUse(Utilisateur utilisateur){
    return utilisateurService.ajouterUtilisateur(utilisateur);
}

@PutMapping ("/affecterUtilisateurClasse")
void affecterUtilisateurClasse(@PathVariable("idUtilisateur") Integer utilisateurId, @PathVariable("codeClasse") Integer classeId) {
    utilisateurService.affecterUtilisateurClasse(utilisateurId, classeId);
}

@GetMapping("/nb-utilisateur-par-niveau/{niveau}")
int nbUtilisateurParNiveau(@PathVariable("niveau") Niveau niveau) {
        return utilisateurService.nbutilisateursParNiveau(niveau);
    }


@PostMapping("/addClasse")
    Classe ajouterClasse(Classe classe) {
        return classeService.ajouterClasse(classe);
    }

@PutMapping("/archive")
    void archive() {
    coursClassroomService.archiverCoursClassrooms();
    }

@DeleteMapping("/desaffecterCoursClassroomClasse/{idCours}")
    void desaffecterCoursClassroomClasse(@PathVariable("idCours") int idCours) {
        coursClassroomService.desaffecterCoursClassroomClasse(idCours);
    }


@GetMapping("/getniveau")
    int count(Niveau niveau){
        return utilisateurService.nbutilisateursParNiveau(niveau);
    }

@DeleteMapping("/nbHeuresParSpecEtNiv/{specialite}/{niveau}")
  int nbHeuresParSpecEtNiv(@PathVariable("specialite") Specialite specialite, @PathVariable("niveau") Niveau niveau) {
        return coursClassroomService.nbHeuresParSpecEtNiv(specialite, niveau);
    }

}

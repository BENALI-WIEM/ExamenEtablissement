package com.example.etablissementuniversitaire.service;

import com.example.etablissementuniversitaire.entity.Niveau;
import com.example.etablissementuniversitaire.entity.Utilisateur;
import org.springframework.stereotype.Service;


public interface IUtilisateurService {
    Utilisateur ajouterUtilisateur(Utilisateur utilisateur);
    void affecterUtilisateurClasse(int idUtilisateur, int codeClasse);
    int nbutilisateursParNiveau(Niveau niveau);

}

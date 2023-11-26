package com.example.etablissementuniversitaire.impl;

import com.example.etablissementuniversitaire.entity.Classe;
import com.example.etablissementuniversitaire.entity.Niveau;
import com.example.etablissementuniversitaire.entity.Utilisateur;
import com.example.etablissementuniversitaire.repository.ClasseRepository;
import com.example.etablissementuniversitaire.repository.UtilisateurRepository;
import com.example.etablissementuniversitaire.service.IUtilisateurService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements IUtilisateurService {
     UtilisateurRepository utilisateurRepository;
     ClasseRepository classeRepository;

    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void affecterUtilisateurClasse(int idUtilisateur, int codeClasse) {
        Classe classe = classeRepository.findById(codeClasse).get();
        Utilisateur utilisateur = utilisateurRepository.findById(idUtilisateur).get();
        utilisateur.setClasse(classe);
        utilisateurRepository.save(utilisateur);
    }

    @Override
    public int nbutilisateursParNiveau(Niveau niveau) {
        return utilisateurRepository.countByClasseNiveau(niveau);
    }
}

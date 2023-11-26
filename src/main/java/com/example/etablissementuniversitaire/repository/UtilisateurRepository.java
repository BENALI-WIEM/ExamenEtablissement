package com.example.etablissementuniversitaire.repository;

import com.example.etablissementuniversitaire.entity.Niveau;
import com.example.etablissementuniversitaire.entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
    int countByClasseNiveau(Niveau niveau);
}

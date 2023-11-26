package com.example.etablissementuniversitaire.impl;

import com.example.etablissementuniversitaire.entity.Classe;
import com.example.etablissementuniversitaire.repository.ClasseRepository;
import com.example.etablissementuniversitaire.service.IClasseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClasseServiceImpl implements IClasseService {
    private ClasseRepository classeRepository;

    @Override
    public Classe ajouterClasse(Classe classe) {
        return classeRepository.save(classe);
    }
}

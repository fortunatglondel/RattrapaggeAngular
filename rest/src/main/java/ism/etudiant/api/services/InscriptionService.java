package ism.etudiant.api.services;

import java.util.List;

import ism.etudiant.api.dto.ClasseDto;
import ism.etudiant.api.dto.EtudiantDto;

public interface InscriptionService {
    

    List<ClasseDto> getClasse();

    ClasseDto getClasseById(Long id);
    ClasseDto createClasse(ClasseDto salle);

    List<EtudiantDto> getEtudiantsByClasseId(Long classeId);

}

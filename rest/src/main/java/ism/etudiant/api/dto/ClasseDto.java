package ism.etudiant.api.dto;

import ism.etudiant.entities.Classe;

public class ClasseDto {


    private Long id;
    private String libelle;

    private String niveau;
    private String filiere;
   


 public ClasseDto(Classe classe) {
        id=classe.getId();
        libelle=classe.getLibelle();
        niveau=classe.getNiveau();
        filiere=classe.getFiliere();
        
    }
    
}

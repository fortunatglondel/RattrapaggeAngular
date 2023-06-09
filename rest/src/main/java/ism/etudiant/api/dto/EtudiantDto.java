package ism.etudiant.api.dto;

import java.util.List;

import ism.etudiant.entities.Etudiant;

public class EtudiantDto {

    private Long id;
    private String  nomComplet;
    private String   login;
    private String   password;
    private Long classeId;

    public EtudiantDto(Etudiant etudiant) {
        id= etudiant.getId();
        nomComplet=etudiant.getNom();
        login=etudiant.getTuteur();
        classeId=etudiant.getClasse().getId();
      
    }

    
}

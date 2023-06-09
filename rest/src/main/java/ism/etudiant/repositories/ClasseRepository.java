package ism.etudiant.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import ism.etudiant.entities.Classe;
import ism.etudiant.entities.Etudiant;

import java.util.List;

public interface ClasseRepository extends JpaRepository<Classe,Long> {



   

}

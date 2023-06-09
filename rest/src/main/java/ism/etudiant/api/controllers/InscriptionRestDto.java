package ism.etudiant.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ism.etudiant.api.dto.ClasseDto;
import ism.etudiant.api.dto.EtudiantDto;
import ism.etudiant.api.exceptions.NoDataException;
import ism.etudiant.api.services.InscriptionService;

@RestController
@RequestMapping("/api/inscription")
public class InscriptionRestDto {
    


    @Autowired
    private InscriptionService inscriptionService;




    @GetMapping("/list")
    @ResponseBody
    public ResponseEntity<List<ClasseDto>> getClasse() {

        List<ClasseDto> body =inscriptionService.getClasse();
        if(body.isEmpty())
            throw new NoDataException("Pas de classe");
        return  new ResponseEntity<>(body, HttpStatus.OK);
    }


    @GetMapping("/{classeId}/etudiantsInscrits")
    public List<EtudiantDto> getEtudiantsByClasseId(@PathVariable Long classeId) {
        return inscriptionService.getEtudiantsByClasseId(classeId);
    }

    


    @GetMapping("/{id}")
    public ResponseEntity<ClasseDto> getSalleById(@PathVariable Long id) {
        ClasseDto classe = inscriptionService.getClasseById(id);
        if (classe != null) {
            return ResponseEntity.ok(classe);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    @PostMapping("")
    public ResponseEntity<ClasseDto> createSalle(@RequestBody ClasseDto classe) {
        ClasseDto createdClasse = inscriptionService.createClasse(classe);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdClasse);
    }

}

package ism.etudiant.controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import ism.etudiant.entities.Classe;
import ism.etudiant.entities.Etudiant;
import ism.etudiant.repositories.ClasseRepository;
import ism.etudiant.repositories.EtudiantRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EtudiantController {


    @Autowired
    ClasseRepository classeRepository;


    
    @Autowired
    private EtudiantRepository etudiantRepository;



//======================================Envoi Post

    @PostMapping("/inscription")
    public String submitInscriptionForm(@ModelAttribute("etudiant") Etudiant etudiant,
                                        @RequestParam("classeId") Long classeId) {
        Classe classe = classeRepository.findById(classeId).orElse(null);
        if (classe != null) {
            etudiant.setClasse(classe);
            classe.getEtudiant().add(etudiant);
            etudiantRepository.save(etudiant);
            classeRepository.save(classe);
        }
        return "redirect:/mesInscriptions";
    }


//======================================List===============
    @GetMapping("/mesInscriptions")
    public String showListInscription(Model model) {
      

        List<Classe> listesClasses = classeRepository.findAll();
        model.addAttribute(" listesClasses",  listesClasses);


        return "mesInscriptions";
    }





  
    @GetMapping("/inscription")
    public String ListInscriptionRoute(Model model) {
        List<Classe> listesClasses = classeRepository.findAll();
        model.addAttribute("etudiant", new Etudiant());
        model.addAttribute("listesClasses", listesClasses);
        return "form.inscription";
    }

    
   
  
}

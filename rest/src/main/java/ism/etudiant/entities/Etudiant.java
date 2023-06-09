package ism.etudiant.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;



@Entity
@Table(name = "etudiants")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(nullable = false)
    private String nom;

    @Column(nullable = false)
    private String prenom;


    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String tuteur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "classe_id")
    private Classe classe;
}

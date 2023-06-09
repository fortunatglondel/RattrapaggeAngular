package ism.etudiant.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "classes")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Column(nullable = false, unique = true)
    private String libelle;

    @Column(nullable = false)
    private String filiere;

    @Column(nullable = false)
    private String niveau;

    @OneToMany(mappedBy = "classe", fetch = FetchType.LAZY)
    private List<Etudiant> etudiant;
}
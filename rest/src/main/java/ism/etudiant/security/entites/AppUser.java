package ism.etudiant.security.entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;



@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue(value = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public  class AppUser {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    
    @Column(nullable = false)
    protected String nomComplet;

    @Column(nullable = false,unique = true)
    protected String email;

    @Column(nullable = false)
    protected String password;




    public AppUser(Long id) {
        this.id = id;
    }

    public AppUser(Long id, String nomComplet) {
        this.id = id;
        this.nomComplet = nomComplet;
    }


    public AppUser(String nomComplet) {
        this.nomComplet = nomComplet;
    }


}
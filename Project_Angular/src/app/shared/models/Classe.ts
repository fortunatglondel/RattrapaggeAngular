import { Etudiant } from "./Etudiant";

export interface Classe {
    id?:number
   
    etudiants: Etudiant[]|string[];
    libelle: string;
    niveau: string;
    filiere: string;
   
  }


  
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment.development';
import { Classe } from '../models/Classe';
import { Observable } from 'rxjs';
import { Etudiant } from '../models/Etudiant';

@Injectable({
  providedIn: 'root'
})
export class InscriptionService {
  private url = `${environment.API}/inscription`;

  constructor(private http: HttpClient) { }

  // Récupérer toutes les classes
  getClasses(): Observable<Classe[]> {
    return this.http.get<Classe[]>(this.url);
  }

  // Récupérer les étudiants par classe
  getEtudiantsByClasseId(classeId: number): Observable<Etudiant[]> {
    return this.http.get<Etudiant[]>(`${this.url}/${classeId}/etudiants`);
  }


  
}

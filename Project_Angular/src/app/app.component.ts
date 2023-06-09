import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'Ism-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {
  
  
  libelle:string="";
  filiere:string="";
  niveau:string="";

 


  etudiant={
    nom:'gloire',
    matricule:'ism'
  }



  ngOnInit(): void {
   console.log("niveau" +this.niveau)
   console.log(`
   niveau :${this.niveau}
   
   
   `)



  }
}

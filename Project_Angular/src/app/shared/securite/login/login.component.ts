import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Rp } from '../../models/Rp';
import { SecurityService } from '../../services/security.service';


@Component({
  selector: 'GloireSelector-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {

  page!: string;
  user: Rp = {
    login: `Baila`,
    password: `Baila`,
  };

  isLoginFailed: boolean = true;
  errorMessage: string = '';
  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private secService: SecurityService,
    
  ) {}


  ngOnInit(): void {
    this.route.queryParams.subscribe((params) => {
    this.page= params['page'];
    });

    alert(this.page)
    
  }


  onConnexion() {

    
    this.secService.connexion(this.user.login, this.user.password );
  
    if (this.secService.isConnect) {
      if (this.secService.isConnect.getValue()) {
        this.router.navigateByUrl('/');
      } else {
        alert('Erreur de connexion');
      }
    }
  }
  
}

import { Component, OnInit } from '@angular/core';
import { ApiServiceService } from 'src/app/services/api-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})


export class LoginComponent implements OnInit {
  
  constructor(private servicio:ApiServiceService, private router: Router) { }

  ngOnInit(): void {
  }

  login(usuario:string, contrasena: string) {
    //alert("Tu usuario es "+ usuario + "y tu contraseña es " + contrasena)
    this.servicio.login(usuario, contrasena).subscribe(
      (data:any) => {
        if(data.autorizado){
          localStorage.setItem("profesor",usuario)
          this.router.navigate(['students'])
        }
        else {
          alert(data.mensaje)
        }
      }
    )
  }
}
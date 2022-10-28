import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  login(usuario:string, contrasena: string) {
    alert("Tu usuario es "+ usuario + "y tu contraseña es " + contrasena)
  }
}

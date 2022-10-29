import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiServiceService {
  host = "http://localhost:3004";
  arrEstudiantes: any = [];

  constructor(private  http:HttpClient) { }

  home() {
    return this.http.get(this.host + '/getHome');
  }

  estudiantes() {
    return this.http.get(this.host + '/students');
  }

  login(user:string, pass:string) {
    return this.http.post(this.host + '/student/login',{
        username: user,
        password: pass
    });
  }

  getOne(user:string) {
    return this.http.get(this.host + '/student/'+ user);
  }
}

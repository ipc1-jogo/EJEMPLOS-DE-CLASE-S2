import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ApiServiceService {
  host = "http://localhost:3000";

  constructor(private  http:HttpClient) { }

  home() {
    return this.http.get(this.host + '/getHome')
  }

}

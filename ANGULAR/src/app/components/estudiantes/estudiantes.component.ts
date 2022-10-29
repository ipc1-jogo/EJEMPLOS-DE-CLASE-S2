import { Component, OnInit } from '@angular/core';
import { ApiServiceService } from 'src/app/services/api-service.service';

@Component({
  selector: 'app-estudiantes',
  templateUrl: './estudiantes.component.html',
  styleUrls: ['./estudiantes.component.css']
})
export class EstudiantesComponent implements OnInit {

  constructor(private servicio: ApiServiceService) { }

  students:any;

  ngOnInit(): void {

    let usuario:any = localStorage.getItem("profesor")

    this.servicio.getOne(usuario).subscribe(
      (data:any) => {
        this.students = data.estudiantes;
      }
    )
  }

}

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

//Mis componenetes
import { LoginComponent } from './components/login/login.component';
import { InicioComponent } from './components/inicio/inicio.component';
import { EstudiantesComponent } from './components/estudiantes/estudiantes.component';

const routes: Routes = [
  {
    path: '',
    component: InicioComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'students',
    component: EstudiantesComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

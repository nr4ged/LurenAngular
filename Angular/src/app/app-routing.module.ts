import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PgServicioComponent } from './Components/Servicio/pg-servicio/pg-servicio.component';

const routes: Routes = [

  {path:'PgServicio', component:PgServicioComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

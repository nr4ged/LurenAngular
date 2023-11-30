import { HttpClient } from '@angular/common/http';

import { Injectable } from '@angular/core';

import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ServicioService {

  private urlApi='Servicio/PgServicio';
  private urlApiPost='Servicio/ingresar';
  cod_servicio="";

  constructor(private http: HttpClient) { }

  public getData(): Observable<any>{
    return this.http.get<any>(this.urlApi);
  }

  public guardarDataServicio(data:any){
    console.log(data);
    return this.http.post(this.urlApiPost,data);
  }

}

import { Component, OnInit, ViewEncapsulation} from '@angular/core';
import { Router } from '@angular/router';
import { ServicioEntity } from 'src/app/Model/Servicio/servicio-entity';
import { ServicioService } from 'src/app/Service/Servicio/servicio.service';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-pg-servicio',
  templateUrl: './pg-servicio.component.html',
  styleUrls: ['./pg-servicio.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class PgServicioComponent implements OnInit{

  frmServicio=new FormGroup({
    cod_servicio: new FormControl(''),
    descripcion_servicio: new FormControl(''),
    precio: new FormControl('')
  })

  servicio:ServicioEntity = new ServicioEntity();

  data: any[]=[];
  ServicioArray: ServicioEntity[]=[];
  constructor(private servicioService:ServicioService, private router:Router){}

  ngOnInit(): void {
      this.llenarData();
      this.modooscuro();

      const script = document.createElement('script');
    script.innerHTML = `
      window.watsonAssistantChatOptions = {
        integrationID: "77cb0010-7bfc-49d1-8730-04e39ef8ae8e",
        region: "au-syd",
        serviceInstanceID: "bccecd14-f5b8-45cc-983a-f3d4812322c4",
        onLoad: function(instance) { instance.render(); }
      };
      setTimeout(function(){
        const t=document.createElement('script');
        t.src="https://web-chat.global.assistant.watson.appdomain.cloud/versions/" + (window.watsonAssistantChatOptions.clientVersion || 'latest') + "/WatsonAssistantChatEntry.js";
        document.head.appendChild(t);
      });
    `;
    document.head.appendChild(script);
  }

  guardarServicio(){
    console.log(this.frmServicio.value);
    this.servicioService.guardarDataServicio(this.frmServicio.value).subscribe((result)=>{
      console.log(result);
      this.frmServicio.reset();
      this.router.navigate(["listar"]);
    })
  }

  llenarData(){
    this.servicioService.getData().subscribe(data=>{
      this.data=data;
      this.ServicioArray=data;
      console.log(this.data);
    })
  }

  private modooscuro(): void {
    // Crear el script
    const script = document.createElement('script');
    script.type = 'text/javascript';
    script.innerHTML = `
      const sideMenu = document.querySelector('aside');
      const menuBtn = document.getElementById('menu-btn');
      const closeBtn = document.getElementById('close-btn');

      const darkMode = document.querySelector('.dark-mode');

      menuBtn.addEventListener('click', () => {
        sideMenu.style.display = 'block';
      });

      closeBtn.addEventListener('click', () => {
        sideMenu.style.display = 'none';
      });

      darkMode.addEventListener('click', () => {
        document.body.classList.toggle('dark-mode-variables');
        darkMode.querySelector('span:nth-child(1)').classList.toggle('active');
        darkMode.querySelector('span:nth-child(2)').classList.toggle('active');
      });
    `;

    // Agregar el script al final del body
    document.body.appendChild(script);
  }
  
}
import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PgServicioComponent } from './pg-servicio.component';

describe('PgServicioComponent', () => {
  let component: PgServicioComponent;
  let fixture: ComponentFixture<PgServicioComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PgServicioComponent]
    });
    fixture = TestBed.createComponent(PgServicioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PipesExempleComponent } from './pipes-exemple.component';

describe('PipesExempleComponent', () => {
  let component: PipesExempleComponent;
  let fixture: ComponentFixture<PipesExempleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PipesExempleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PipesExempleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

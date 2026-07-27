import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EvenPlayersComponent } from './even-players.component';

describe('EvenPlayersComponent', () => {
  let component: EvenPlayersComponent;
  let fixture: ComponentFixture<EvenPlayersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EvenPlayersComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EvenPlayersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

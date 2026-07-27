import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IndianPlayersComponent } from './indian-players.component';

describe('IndianPlayersComponent', () => {
  let component: IndianPlayersComponent;
  let fixture: ComponentFixture<IndianPlayersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [IndianPlayersComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(IndianPlayersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

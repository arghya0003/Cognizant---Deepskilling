import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OddPlayersComponent } from './odd-players.component';

describe('OddPlayersComponent', () => {
  let component: OddPlayersComponent;
  let fixture: ComponentFixture<OddPlayersComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OddPlayersComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OddPlayersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

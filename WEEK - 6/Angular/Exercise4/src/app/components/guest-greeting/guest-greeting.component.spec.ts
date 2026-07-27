import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GuestGreetingComponent } from './guest-greeting.component';

describe('GuestGreetingComponent', () => {
  let component: GuestGreetingComponent;
  let fixture: ComponentFixture<GuestGreetingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GuestGreetingComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GuestGreetingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

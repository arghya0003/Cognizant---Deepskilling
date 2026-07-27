import { Component, Input } from '@angular/core';
import { GuestGreetingComponent } from '../guest-greeting/guest-greeting.component';
import { UserGreetingComponent } from '../user-greeting/user-greeting.component';

@Component({
  selector: 'app-greeting',
  imports: [GuestGreetingComponent, UserGreetingComponent],
  templateUrl: './greeting.component.html',
  styleUrl: './greeting.component.css'
})
export class GreetingComponent {
  @Input() isLoggedIn = false;
}

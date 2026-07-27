import { Component } from '@angular/core';
import { GreetingComponent } from './components/greeting/greeting.component';
import { LoginButtonComponent } from './components/login-button/login-button.component';
import { LogoutButtonComponent } from './components/logout-button/logout-button.component';

@Component({
  selector: 'app-root',
  imports: [GreetingComponent, LoginButtonComponent, LogoutButtonComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ticket-booking-app';
  isLoggedIn = false;

  handleLogin(): void {
    this.isLoggedIn = true;
  }

  handleLogout(): void {
    this.isLoggedIn = false;
  }
}

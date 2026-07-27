import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-login-button',
  imports: [],
  templateUrl: './login-button.component.html',
  styleUrl: './login-button.component.css'
})
export class LoginButtonComponent {
  @Output() clicked = new EventEmitter<void>();
}

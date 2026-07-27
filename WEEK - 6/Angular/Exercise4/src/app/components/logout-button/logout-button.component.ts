import { Component, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-logout-button',
  imports: [],
  templateUrl: './logout-button.component.html',
  styleUrl: './logout-button.component.css'
})
export class LogoutButtonComponent {
  @Output() clicked = new EventEmitter<void>();
}

import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-even-players',
  imports: [],
  templateUrl: './even-players.component.html',
  styleUrl: './even-players.component.css'
})
export class EvenPlayersComponent {
  @Input() second!: string;
  @Input() fourth!: string;
  @Input() sixth!: string;
}

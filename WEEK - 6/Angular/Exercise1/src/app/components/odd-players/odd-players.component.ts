import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-odd-players',
  imports: [],
  templateUrl: './odd-players.component.html',
  styleUrl: './odd-players.component.css'
})
export class OddPlayersComponent {
  @Input() first!: string;
  @Input() third!: string;
  @Input() fifth!: string;
}

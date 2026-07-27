import { Component } from '@angular/core';
import { OddPlayersComponent } from '../odd-players/odd-players.component';
import { EvenPlayersComponent } from '../even-players/even-players.component';

@Component({
  selector: 'app-indian-players',
  imports: [OddPlayersComponent, EvenPlayersComponent],
  templateUrl: './indian-players.component.html',
  styleUrl: './indian-players.component.css'
})
export class IndianPlayersComponent {
  indianTeam = ['Virat', 'Rohit', 'Gill', 'Rahul', 'Pant', 'Hardik'];

  first = this.indianTeam[0];
  second = this.indianTeam[1];
  third = this.indianTeam[2];
  fourth = this.indianTeam[3];
  fifth = this.indianTeam[4];
  sixth = this.indianTeam[5];

  t20Players = ['Virat', 'Rohit', 'Hardik'];
  ranjiPlayers = ['Pujara', 'Rahane', 'Sarfaraz'];

  mergedPlayers = [...this.t20Players, ...this.ranjiPlayers];
}

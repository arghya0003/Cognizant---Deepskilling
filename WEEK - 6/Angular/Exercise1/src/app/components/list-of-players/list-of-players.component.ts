import { Component } from '@angular/core';

interface Player {
  name: string;
  score: number;
}

@Component({
  selector: 'app-list-of-players',
  imports: [],
  templateUrl: './list-of-players.component.html',
  styleUrl: './list-of-players.component.css'
})
export class ListOfPlayersComponent {
  players: Player[] = [
    { name: 'Virat', score: 90 },
    { name: 'Rohit', score: 82 },
    { name: 'Gill', score: 68 },
    { name: 'Rahul', score: 74 },
    { name: 'Pant', score: 66 },
    { name: 'Hardik', score: 88 },
    { name: 'Jadeja', score: 59 },
    { name: 'Ashwin', score: 72 },
    { name: 'Bumrah', score: 95 },
    { name: 'Shami', score: 61 },
    { name: 'Siraj', score: 77 }
  ];

  players70: Player[] = this.players.filter((player) => player.score < 70);
}

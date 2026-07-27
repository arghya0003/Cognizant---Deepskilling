import { Component } from '@angular/core';
import { ListOfPlayersComponent } from './components/list-of-players/list-of-players.component';
import { IndianPlayersComponent } from './components/indian-players/indian-players.component';

@Component({
  selector: 'app-root',
  imports: [ListOfPlayersComponent, IndianPlayersComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'cricket-app';
  flag = true;
}

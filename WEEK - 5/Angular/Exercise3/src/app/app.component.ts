import { Component } from '@angular/core';
import { CalculateScoreComponent } from './components/calculate-score/calculate-score.component';

@Component({
  selector: 'app-root',
  imports: [CalculateScoreComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'score-calculator-app';
}

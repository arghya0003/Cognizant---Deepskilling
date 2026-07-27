import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-calculate-score',
  imports: [],
  templateUrl: './calculate-score.component.html',
  styleUrl: './calculate-score.component.css'
})
export class CalculateScoreComponent {
  @Input() name!: string;
  @Input() school!: string;
  @Input() total!: number;
  @Input() goal!: number;

  private percentToDecimal(decimal: number): string {
    return decimal.toFixed(2) + '%';
  }

  calcScore(): string {
    return this.percentToDecimal(this.total / this.goal);
  }
}

import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-currency-converter',
  imports: [FormsModule],
  templateUrl: './currency-converter.component.html',
  styleUrl: './currency-converter.component.css'
})
export class CurrencyConverterComponent {
  amount: number | null = null;

  handleSubmit(): void {
    const euro = (this.amount ?? 0) * 80;
    alert('Converting to Euro Amount is ' + euro);
  }
}

import { Component } from '@angular/core';
import { CurrencyConverterComponent } from './components/currency-converter/currency-converter.component';

@Component({
  selector: 'app-root',
  imports: [CurrencyConverterComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'event-examples-app';
  count = 0;

  increment(): void {
    this.count = this.count + 1;
  }

  decrement(): void {
    this.count = this.count - 1;
  }

  sayHello(): void {
    alert('Hello! Member');
  }

  increase(): void {
    this.increment();
    this.sayHello();
  }

  sayWelcome(msg: string): void {
    alert(msg);
  }

  onPress(): void {
    alert('I was clicked');
  }
}

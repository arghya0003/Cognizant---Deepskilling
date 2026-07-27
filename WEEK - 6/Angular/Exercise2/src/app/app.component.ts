import { Component } from '@angular/core';

interface Office {
  name: string;
  rent: number;
  address: string;
}

@Component({
  selector: 'app-root',
  imports: [],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'office-space-rental-app';

  offices: Office[] = [
    { name: 'Sky Tower', rent: 55000, address: 'Hyderabad' },
    { name: 'Tech Park', rent: 75000, address: 'Bangalore' },
    { name: 'Cyber Hub', rent: 45000, address: 'Chennai' }
  ];
}

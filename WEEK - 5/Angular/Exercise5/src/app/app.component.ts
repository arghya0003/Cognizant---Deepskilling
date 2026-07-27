import { Component } from '@angular/core';
import { CohortDetailsComponent } from './components/cohort-details/cohort-details.component';
import { CohortsData } from './models/cohort';

@Component({
  selector: 'app-root',
  imports: [CohortDetailsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'cohort-tracker';
  cohortsData = CohortsData;
}

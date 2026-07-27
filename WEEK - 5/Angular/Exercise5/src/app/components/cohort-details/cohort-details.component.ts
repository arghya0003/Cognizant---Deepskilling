import { Component, Input } from '@angular/core';
import { Cohort } from '../../models/cohort';

@Component({
  selector: 'app-cohort-details',
  imports: [],
  templateUrl: './cohort-details.component.html',
  styleUrl: './cohort-details.component.css'
})
export class CohortDetailsComponent {
  @Input() cohort!: Cohort;
}

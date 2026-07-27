import { Component, Input } from '@angular/core';
import { Course } from '../../models/data';

@Component({
  selector: 'app-course-details',
  imports: [],
  templateUrl: './course-details.component.html',
  styleUrl: './course-details.component.css'
})
export class CourseDetailsComponent {
  @Input() courses: Course[] = [];
}

import { Component } from '@angular/core';
import { CourseDetailsComponent } from './components/course-details/course-details.component';
import { BookDetailsComponent } from './components/book-details/book-details.component';
import { BlogDetailsComponent } from './components/blog-details/blog-details.component';
import { courses, books, blogs } from './models/data';

@Component({
  selector: 'app-root',
  imports: [CourseDetailsComponent, BookDetailsComponent, BlogDetailsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'blogger-app';

  showCourses = true;
  showBooks = true;
  showBlogs = true;

  courses = courses;
  books = books;
  blogs = blogs;
}

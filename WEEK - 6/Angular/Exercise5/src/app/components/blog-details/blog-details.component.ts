import { Component, Input } from '@angular/core';
import { Blog } from '../../models/data';

@Component({
  selector: 'app-blog-details',
  imports: [],
  templateUrl: './blog-details.component.html',
  styleUrl: './blog-details.component.css'
})
export class BlogDetailsComponent {
  @Input() blogs: Blog[] = [];
}

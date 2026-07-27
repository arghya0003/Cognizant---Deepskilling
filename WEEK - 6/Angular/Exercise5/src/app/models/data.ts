export interface Course {
  id: number;
  cname: string;
  date: string;
}

export interface Book {
  id: number;
  bname: string;
  price: number;
}

export interface Blog {
  id: number;
  title: string;
  author: string;
  content: string;
}

export const courses: Course[] = [
  { id: 1, cname: 'Angular', date: '4/5/2021' },
  { id: 2, cname: 'React', date: '6/3/2021' }
];

export const books: Book[] = [
  { id: 1, bname: 'Master React', price: 670 },
  { id: 2, bname: 'Deep Dive into Angular 11', price: 800 },
  { id: 3, bname: 'Mongo Essentials', price: 450 }
];

export const blogs: Blog[] = [
  { id: 1, title: 'React Learning', author: 'Stephen Biz', content: 'Welcome to learning React!' },
  { id: 2, title: 'Installation', author: 'Schwezdneier', content: 'You can install React from npm.' }
];

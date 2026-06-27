public class LibraryManagementSystem {

    // Linear Search
    static void linearSearch(Book[] books, String key) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(key)) {
                System.out.println("Book Found (Linear Search):");
                book.display();
                return;
            }
        }
        System.out.println("Book Not Found.");
    }

    // Binary Search 
    static void binarySearch(Book[] books, String key) {
        int low = 0;
        int high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = books[mid].title.compareToIgnoreCase(key);

            if (cmp == 0) {
                System.out.println("Book Found (Binary Search):");
                books[mid].display();
                return;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Book Not Found.");
    }

    public static void main(String[] args) {

        // Sorted by title
        Book[] books = {
                new Book(101, "C Programming", "Dennis Ritchie"),
                new Book(102, "Data Structures", "Mark Allen"),
                new Book(103, "Java Programming", "James Gosling"),
                new Book(104, "Python Basics", "Guido van Rossum")
        };

        System.out.println("Linear Search:");
        linearSearch(books, "Java Programming");

        System.out.println();

        System.out.println("Binary Search:");
        binarySearch(books, "Java Programming");
    }
}
public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(105, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(103, "Mobile", "Electronics"),
                new Product(107, "Watch", "Accessories"),
                new Product(102, "Book", "Education")

        };

        int searchId = 103;

        // Linear Search
        Product result1 = SearchProduct.linearSearch(products, searchId);

        if (result1 != null)
            System.out.println("Linear Search Result:");
        else
            System.out.println("Product Not Found.");

        System.out.println(result1);

        // Sort Array
        SearchProduct.sortProducts(products);

        // Binary Search
        Product result2 = SearchProduct.binarySearch(products, searchId);

        if (result2 != null)
            System.out.println("\nBinary Search Result:");
        else
            System.out.println("Product Not Found.");

        System.out.println(result2);
    }
}
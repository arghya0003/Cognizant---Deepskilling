import java.util.Arrays;
import java.util.Comparator;

public class SearchProduct {

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {

        for (Product p : products) {
            if (p.getProductId() == id) {
                return p;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (products[mid].getProductId() == id)
                return products[mid];

            else if (products[mid].getProductId() < id)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return null;
    }

    // Sort Products
    public static void sortProducts(Product[] products) {
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));
    }
}
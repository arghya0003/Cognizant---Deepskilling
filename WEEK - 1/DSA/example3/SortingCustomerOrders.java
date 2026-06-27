public class SortingCustomerOrders {

    // Bubble Sort
    static void bubbleSort(Order[] orders) {
        int n = orders.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    // Quick Sort
    static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);

            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice < pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    static void displayOrders(Order[] orders) {
        System.out.println("OrderID\tCustomer\tTotal Price");
        for (Order order : orders) {
            order.display();
        }
    }

    public static void main(String[] args) {

        Order[] orders1 = {
                new Order(101, "Alice", 2500),
                new Order(102, "Bob", 1200),
                new Order(103, "Charlie", 3400),
                new Order(104, "David", 1800)
        };

        System.out.println("Original Orders:");
        displayOrders(orders1);

        bubbleSort(orders1);

        System.out.println("\nAfter Bubble Sort:");
        displayOrders(orders1);

        Order[] orders2 = {
                new Order(101, "Alice", 2500),
                new Order(102, "Bob", 1200),
                new Order(103, "Charlie", 3400),
                new Order(104, "David", 1800)
        };

        quickSort(orders2, 0, orders2.length - 1);

        System.out.println("\nAfter Quick Sort:");
        displayOrders(orders2);
    }
}
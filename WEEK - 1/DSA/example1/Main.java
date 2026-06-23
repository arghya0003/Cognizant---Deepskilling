import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        InventoryManagement inventory = new InventoryManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Inventory Management System =====");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Products");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    inventory.addProduct(new Product(id, name, quantity, price));
                    break;

                case 2:
                    System.out.print("Enter Product ID to Update: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter New Quantity: ");
                    quantity = sc.nextInt();

                    System.out.print("Enter New Price: ");
                    price = sc.nextDouble();

                    inventory.updateProduct(id, name, quantity, price);
                    break;

                case 3:
                    System.out.print("Enter Product ID to Delete: ");
                    id = sc.nextInt();

                    inventory.deleteProduct(id);
                    break;

                case 4:
                    inventory.displayProducts();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
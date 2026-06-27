public class EmployeeManagementSystem {

    static Employee[] employees = new Employee[10];
    static int count = 0;

    // Add Employee
    static void addEmployee(Employee emp) {
        if (count < employees.length) {
            employees[count++] = emp;
            System.out.println("Employee Added.");
        } else {
            System.out.println("Array is Full!");
        }
    }

    // Search Employee
    static void searchEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                System.out.println("Employee Found:");
                employees[i].display();
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }

    // Traverse Employees
    static void traverseEmployees() {
        System.out.println("\nEmployee Records:");
        System.out.println("ID\tName\tPosition\tSalary");
        for (int i = 0; i < count; i++) {
            employees[i].display();
        }
    }

    // Delete Employee
    static void deleteEmployee(int id) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeId == id) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                System.out.println("Employee Deleted.");
                return;
            }
        }
        System.out.println("Employee Not Found.");
    }

    public static void main(String[] args) {

        addEmployee(new Employee(101, "Alice", "Manager", 60000));
        addEmployee(new Employee(102, "Bob", "Developer", 50000));
        addEmployee(new Employee(103, "Charlie", "Tester", 45000));

        traverseEmployees();

        System.out.println("\nSearching Employee ID 102:");
        searchEmployee(102);

        System.out.println("\nDeleting Employee ID 102:");
        deleteEmployee(102);

        traverseEmployees();
    }
}
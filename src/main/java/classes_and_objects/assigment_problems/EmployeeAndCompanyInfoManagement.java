package classes_and_objects.assigment_problems;

/**
 * M5. Employee and Company Information Management — Driver class
 *
 * Creates three EmployeeStatic objects, then calls printCompanyInfo()
 * through the CLASS name (not through any object).
 *
 * Topics: Static vs Instance, Static Method Invocation
 */
public class EmployeeAndCompanyInfoManagement {

    public static void main(String[] args) {
        // Create three employees
        EmployeeStatic e1 = new EmployeeStatic("Alice", 55000);
        EmployeeStatic e2 = new EmployeeStatic("Bob", 62000);
        EmployeeStatic e3 = new EmployeeStatic("Charlie", 48000);

        // Call printCompanyInfo() through the class name, NOT through any object
        EmployeeStatic.printCompanyInfo();
        // Expected output:
        // Bright Horizon Technologies
        // Employees on record: 3
    }
}

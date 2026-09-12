package classes_and_objects.assigment_problems;

/**
 * M3. Employee Profile Creation — Driver class
 *
 * Creates one Employee object with each constructor and calls
 * printProfile() on both.
 */
public class EmployeeProfileCreation {

    public static void main(String[] args) {
        // Permanent employee
        Employee permanent = new Employee("E-101", "Divya", 65000);
        permanent.printProfile();
        // Expected: E-101 | Divya | Rs 65000.0 | Intern: false

        // Intern
        Employee intern = new Employee("E-102", "Arjun");
        intern.printProfile();
        // Expected: E-102 | Arjun | Rs 0.0 | Intern: true
    }
}

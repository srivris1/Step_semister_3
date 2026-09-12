package classes_and_objects.assigment_problems;

/**
 * EmployeeStatic class for M5 — Employee and Company Information Management.
 *
 * A trainee developer's first draft stores companyName as an instance field
 * — meaning every single employee object ends up with its own copy of
 * "Bright Horizon Technologies". Fix the design using static fields.
 *
 * - Instance fields: empName, salary
 * - Static field: companyName (shared by every employee)
 * - Static field: employeeCount (incremented once inside the constructor)
 * - Static method: printCompanyInfo() — prints companyName and employeeCount,
 *   must NOT reference any instance field
 *
 * Topics: Static vs Instance Fields, Static Methods
 */
public class EmployeeStatic {

    String empName;
    double salary;

    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    /**
     * Constructs an employee and increments the shared employee count.
     */
    public EmployeeStatic(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    /**
     * Prints companyName and employeeCount — does NOT reference any
     * instance field.
     */
    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

package classes_and_objects.assigment_problems;

/**
 * Employee class for M3 — Employee Profile Creation.
 *
 * Interns join without a fixed salary structure yet; permanent employees
 * join with a known salary from day one. Support both without writing the
 * same setup logic twice.
 *
 * - Constructor Employee(empId, empName, salary) for permanent employees (isIntern = false)
 * - Constructor Employee(empId, empName) for interns — chains to 3-arg constructor
 *   via this(...) with salary = 0, then sets isIntern = true
 * - printProfile() prints all four fields on one line
 *
 * Topics: Constructor Chaining (this(...)), Constructor Overloading
 */
public class Employee {

    String empId;
    String empName;
    double salary;
    boolean isIntern;

    /**
     * Permanent employee constructor — sets isIntern to false.
     */
    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
        this.isIntern = false;
    }

    /**
     * Intern constructor — chains to the three-argument constructor via this(...)
     * with salary set to 0, then sets isIntern to true afterwards.
     */
    public Employee(String empId, String empName) {
        this(empId, empName, 0);
        this.isIntern = true;
    }

    /**
     * Prints all four fields on one line.
     */
    void printProfile() {
        System.out.println(empId + " | " + empName + " | Rs " + salary + " | Intern: " + isIntern);
    }
}

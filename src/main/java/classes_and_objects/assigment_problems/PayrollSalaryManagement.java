package classes_and_objects.assigment_problems;

/**
 * M2. Payroll Salary Management — Driver class
 *
 * Demonstrates the PayrollAccount class with encapsulation:
 * credit bonus, deduct tax, and read net salary.
 */
public class PayrollSalaryManagement {

    public static void main(String[] args) {
        PayrollAccount account = new PayrollAccount(50000);

        account.creditBonus(5000);
        // Expected: Bonus credited: Rs 5000.0

        account.deductTax(10);
        // Expected: Tax deducted: 10%

        System.out.println("Net salary: Rs " + account.getNetSalary());
        // Expected: Net salary: Rs 50000.0
        // (50000 - 10% = 45000 basic + 5000 bonus = 50000)
    }
}

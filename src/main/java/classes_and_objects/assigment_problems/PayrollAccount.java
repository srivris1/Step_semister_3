package classes_and_objects.assigment_problems;

/**
 * PayrollAccount class for M2 — Payroll Salary Management.
 *
 * A company's payroll account must never let its net salary be set directly
 * from outside the class, and bonuses must never be negative.
 *
 * - private double basicSalary, bonus
 * - creditBonus(amount) rejects amount <= 0
 * - deductTax(percent) reduces basicSalary by that percentage, rejects 0–100 range violations
 * - getNetSalary() returns basicSalary + bonus (read-only access)
 *
 * Topics: Encapsulation, Access Modifiers, Validation
 */
public class PayrollAccount {

    private double basicSalary;
    private double bonus;

    /**
     * Accepts an opening basic salary; if negative, starts at 0 with a warning.
     */
    public PayrollAccount(double basicSalary) {
        if (basicSalary < 0) {
            System.out.println("Warning: Negative salary provided. Starting at 0.");
            this.basicSalary = 0;
        } else {
            this.basicSalary = basicSalary;
        }
        this.bonus = 0;
    }

    /**
     * Credits a bonus amount. Rejects amount <= 0 with a message.
     */
    public void creditBonus(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Bonus must be positive. Rejected.");
            return;
        }
        this.bonus += amount;
        System.out.println("Bonus credited: Rs " + amount);
    }

    /**
     * Deducts tax by reducing basicSalary by the given percentage.
     * Rejects percent outside the 0–100 range with a message.
     */
    public void deductTax(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Error: Tax percent must be between 0 and 100. Rejected.");
            return;
        }
        basicSalary -= basicSalary * percent / 100;
        System.out.println("Tax deducted: " + percent + "%");
    }

    /**
     * Returns basicSalary + bonus for read-only access.
     * There is no public way to set basicSalary or bonus directly.
     */
    public double getNetSalary() {
        return basicSalary + bonus;
    }
}

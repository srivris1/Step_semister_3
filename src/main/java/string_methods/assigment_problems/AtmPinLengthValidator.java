package string_methods.assigment_problems;

import java.util.Scanner;

/**
 * Problem 1: ATM PIN Length Validator
 *
 * Scenario: An ATM app must check that a PIN a customer enters is exactly
 * 4 digits long before allowing them to continue.
 *
 * Task: Accept a PIN string, get its length using length(), and validate.
 */
public class AtmPinLengthValidator {

    public static void checkPinLength(String pin) {
        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();
        checkPinLength(pin);
        sc.close();
    }
}

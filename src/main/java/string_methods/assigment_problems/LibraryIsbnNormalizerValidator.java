package string_methods.assigment_problems;

import java.util.Scanner;

/**
 * Problem 4: Library ISBN Normalizer & Validator
 *
 * Scenario: A library system's book-intake scanner normalizes and validates
 * ISBN-style codes. A valid code is exactly 13 characters: 3 letters (publisher code)
 * + 4 digits (year) + 6 digits (catalog number).
 *
 * Task: Normalize (trim + uppercase first 3 chars), then validate structure.
 */
public class LibraryIsbnNormalizerValidator {

    public static String normalizeCode(String raw) {
        String trimmed = raw.trim();
        if (trimmed.length() < 3) return trimmed;
        return trimmed.substring(0, 3).toUpperCase() + trimmed.substring(3);
    }

    public static String validateAndFormat(String code) {
        // Check length
        if (code.length() != 13) {
            return "Invalid: code must be exactly 13 characters (got " + code.length() + ")";
        }

        // Check first 3 are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        // Check remaining 10 are digits
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: characters after publisher code must all be digits";
            }
        }

        // Format output
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(code.substring(0, 3)).append("]");
        sb.append(" YEAR: ").append(code.substring(3, 7));
        sb.append(" | CATALOG: ").append(code.substring(7, 13));

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter raw ISBN code: ");
        String raw = sc.nextLine();

        String normalized = normalizeCode(raw);
        System.out.println(validateAndFormat(normalized));
        sc.close();
    }
}

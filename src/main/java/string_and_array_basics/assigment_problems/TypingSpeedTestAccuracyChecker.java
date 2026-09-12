package string_and_array_basics.assigment_problems;

import java.util.Scanner;

/**
 * Problem 2: The Typing Speed Test Accuracy Checker
 *
 * Scenario: An online typing-practice website shows users a fixed passage and asks
 * them to retype it. The system compares character by character and reports accuracy
 * along with the position of the first mismatch.
 *
 * Task: Accept two strings of equal length, compare character by character,
 * count matches, calculate accuracy percentage, and report first mismatch position.
 */
public class TypingSpeedTestAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        int matchCount = 0;
        int firstMismatchPos = -1;
        char expectedChar = ' ';
        char actualChar = ' ';

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchCount++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1; // 1-indexed
                expectedChar = original.charAt(i);
                actualChar = typed.charAt(i);
            }
        }

        double accuracy = ((double) matchCount / original.length()) * 100;

        System.out.printf("Matched: %d/%d | Accuracy: %.2f%%", matchCount, original.length(), accuracy);
        if (firstMismatchPos == -1) {
            System.out.println(" | No Mismatches");
        } else {
            System.out.printf(" | First Mismatch at position %d ('%c' vs '%c')%n",
                    firstMismatchPos, expectedChar, actualChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the original passage: ");
        String original = sc.nextLine();

        System.out.print("Enter the typed text: ");
        String typed = sc.nextLine();

        checkTypingAccuracy(original, typed);
        sc.close();
    }
}

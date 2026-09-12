package string_and_array_basics.assigment_problems;

import java.util.Scanner;

/**
 * Problem 1: The Exam Hall Seat Duplication Checker
 *
 * Scenario: The Examination Cell manages seat allocation across a large exam hall.
 * Before an exam begins, invigilators must confirm that no seat number has been
 * assigned to two different students by mistake.
 *
 * Task: Accept an array of seat numbers (integers) and compare every seat number
 * against every other to check for duplicates (arrays and loops only).
 */
public class ExamHallSeatDuplicationChecker {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean found = false;

        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seats: ");
        int n = sc.nextInt();
        int[] seatNumbers = new int[n];

        System.out.print("Enter seat numbers: ");
        for (int i = 0; i < n; i++) {
            seatNumbers[i] = sc.nextInt();
        }

        checkDuplicateSeats(seatNumbers);
        sc.close();
    }
}

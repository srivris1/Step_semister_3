package string_and_array_basics.assigment_problems;

import java.util.Scanner;

/**
 * Problem 3: The Traffic Signal Streak Analyzer
 *
 * Scenario: The city traffic control department logs the color shown by a signal
 * every minute using single letters — 'R' for red, 'Y' for yellow, 'G' for green.
 * Engineers need to find the longest continuous streak of the same color.
 *
 * Task: Accept a string of signal readings, scan through it and track the length
 * of each streak of consecutive identical characters, then print the longest streak.
 */
public class TrafficSignalStreakAnalyzer {

    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Empty signal log");
            return;
        }

        char longestChar = signalLog.charAt(0);
        int longestLength = 1;
        int currentLength = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestChar = signalLog.charAt(i);
            }
        }

        System.out.println("Longest Streak: '" + longestChar + "' repeated " + longestLength + " times");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal log (e.g., RRGGGYRR): ");
        String signalLog = sc.nextLine();

        findLongestStreak(signalLog);
        sc.close();
    }
}

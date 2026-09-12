package string_and_array_basics.assigment_problems;

import java.util.Scanner;

/**
 * Problem 5: The Movie Review Word Length Profiler
 *
 * Scenario: A movie-review platform's moderation tool scans submitted reviews
 * and profiles the length of words used — reviews stuffed with unusually many
 * very short or very long words are more likely to be spam.
 *
 * Task: Accept a movie review string, split into words, classify each word as
 * Short (1-4 letters), Medium (5-8 letters), or Long (9+ letters), and print counts.
 */
public class MovieReviewWordLengthProfiler {

    public static void classifyWordLengths(String review) {
        String[] words = review.split(" ");

        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (String word : words) {
            int len = word.length();
            if (len >= 1 && len <= 4) {
                shortCount++;
            } else if (len >= 5 && len <= 8) {
                mediumCount++;
            } else if (len >= 9) {
                longCount++;
            }
        }

        System.out.println("Short: " + shortCount +
                " | Medium: " + mediumCount +
                " | Long: " + longCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie review: ");
        String review = sc.nextLine();

        classifyWordLengths(review);
        sc.close();
    }
}

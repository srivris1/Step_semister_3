package string_methods.assigment_problems;

import java.util.*;

/**
 * Problem 5: Stop-Word-Filtered Word Frequency Report
 *
 * Scenario: The T&P team wants word-frequency analysis of feedback paragraphs,
 * but common filler words should be excluded so the report highlights meaningful themes.
 *
 * Task: Normalize text (lowercase, strip punctuation), split into words,
 * skip stop words, count frequencies using HashMap, print sorted by count descending.
 */
public class StopWordFilteredWordFrequencyReport {

    public static void printFilteredWordFrequency(String feedback) {
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        // Normalize: lowercase and strip punctuation
        String cleaned = feedback.toLowerCase()
                .replace(".", "")
                .replace(",", "")
                .replace("!", "")
                .replace("?", "")
                .replace(";", "")
                .replace(":", "");

        String[] words = cleaned.split("\\s+");

        // Count frequencies, skipping stop words
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            if (word.isEmpty()) continue;

            boolean isStopWord = false;
            for (String sw : stopWords) {
                if (word.equals(sw)) {
                    isStopWord = true;
                    break;
                }
            }

            if (!isStopWord) {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }

        // Sort by count descending
        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(freq.entrySet());
        sorted.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> entry : sorted) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feedback: ");
        String feedback = sc.nextLine();
        printFilteredWordFrequency(feedback);
        sc.close();
    }
}

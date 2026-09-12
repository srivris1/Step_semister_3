package string_methods.assigment_problems;

import java.util.Scanner;

/**
 * Problem 2: Word Reversal Encoder
 *
 * Scenario: The coding club's "mirror text" mini-game reverses every word
 * in a sentence individually while keeping the word order the same.
 *
 * Task: Accept a sentence, split into words, reverse each word using
 * StringBuilder, and join them back together.
 */
public class WordReversalEncoder {

    public static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder reversed = new StringBuilder(words[i]);
            reversed.reverse();
            if (i > 0) result.append(" ");
            result.append(reversed);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.println(reverseEachWord(sentence));
        sc.close();
    }
}

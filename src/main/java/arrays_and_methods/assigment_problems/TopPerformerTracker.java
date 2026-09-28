package arrays_and_methods.assigment_problems;

/**
 * PROBLEM 3 — Intermediate
 * Top Performer Tracker
 *
 * A fantasy league's weekly recap wants to instantly call out the week's
 * standout performer and the week's biggest disappointment, along with
 * how wide the gap between them was — without sorting the entire
 * scoreboard just to read off two numbers.
 *
 * Topics: Arrays, Loops, Logical Thinking
 */
public class TopPerformerTracker {

    /**
     * Finds the minimum and maximum in a single pass through the array
     * (no sorting).
     *
     * @param scores the fantasy scores for the week
     * @return "Min: <min> | Max: <max> | Spread: <max-min>"
     */
    static String findMinMaxSpread(int[] scores) {
        int min = scores[0];
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        return "Min: " + min + " | Max: " + max + " | Spread: " + (max - min);
    }

    public static void main(String[] args) {
        int[] scores = {45, 82, 79, 90, 33, 90, 61};
        System.out.println(findMinMaxSpread(scores));
        // Expected: Min: 33 | Max: 90 | Spread: 57
    }
}

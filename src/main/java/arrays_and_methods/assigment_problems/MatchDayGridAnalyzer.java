package arrays_and_methods.assigment_problems;

/**
 * PROBLEM 4 — Intermediate
 * Match Day Grid Analyzer
 *
 * A cricket stats app logs runs scored in every over of every match as a
 * grid — one row per match, one column per over. The app wants to flag
 * which matches were genuine "Power Surge" innings (a high scoring rate
 * throughout) without repeating the same averaging code once per match.
 *
 * Topics: 2D Arrays, User-Defined Methods (reused), Loops
 */
public class MatchDayGridAnalyzer {

    /**
     * Computes the average runs per over for a single match (row).
     * Does nothing except compute and return one match's average.
     *
     * @param row runs scored in each over of a single match
     * @return the average runs per over
     */
    static double rowAverage(int[] row) {
        int sum = 0;
        for (int runs : row) {
            sum += runs;
        }
        return (double) sum / row.length;
    }

    /**
     * Classifies each match as "Power Surge" (average >= threshold) or
     * "Normal" (average < threshold).
     *
     * @param runsPerOver 2D array — rows are matches, columns are overs
     * @param threshold   minimum average to qualify as Power Surge
     * @return pipe-separated classification string
     */
    static String classifyMatches(int[][] runsPerOver, int threshold) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < runsPerOver.length; i++) {
            if (i > 0) {
                result.append(" | ");
            }
            double avg = rowAverage(runsPerOver[i]);
            String label = avg >= threshold ? "Power Surge" : "Normal";
            result.append("Match ").append(i).append(": ").append(label);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int[][] runsPerOver = {
                {4, 6, 8},
                {10, 12, 14},
                {2, 3, 1}
        };
        int threshold = 8;

        System.out.println(classifyMatches(runsPerOver, threshold));
        // Expected: Match 0: Normal | Match 1: Power Surge | Match 2: Normal
    }
}

package arrays_and_methods.assigment_problems;

import java.util.Arrays;

/**
 * PROBLEM 1 — Easy
 * Fantasy Team Score Multiplier
 *
 * In a fantasy sports app, every user picks a Captain (2× points) and a
 * Vice-Captain (1.5× points) from their lineup. This method applies both
 * multipliers directly to the lineup's score array so the scoreboard
 * reflects the boosted totals immediately after the match end.
 *
 * Topics: Creating/Modifying Arrays, Arrays Passed by Reference
 */
public class FantasyTeamScoreMultiplier {

    /**
     * Modifies the caller's original array directly — returns nothing.
     * Only the captain's and vice-captain's positions change;
     * every other score stays exactly as it was.
     *
     * @param playerScores     the lineup score array (modified in place)
     * @param captainIndex     index of the captain (2× multiplier)
     * @param viceCaptainIndex index of the vice-captain (1.5× multiplier)
     */
    static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        playerScores[captainIndex] *= 2;
        playerScores[viceCaptainIndex] *= 1.5;
    }

    public static void main(String[] args) {
        double[] scores = {40, 55, 30, 62};
        System.out.println("Before: " + Arrays.toString(scores));

        applyMultipliers(scores, 1, 3);

        System.out.println("After:  " + Arrays.toString(scores));
        // Expected: [40.0, 110.0, 30.0, 93.0]
    }
}

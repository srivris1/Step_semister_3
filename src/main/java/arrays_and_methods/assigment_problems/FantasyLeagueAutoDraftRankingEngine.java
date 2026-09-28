package arrays_and_methods.assigment_problems;

import java.util.Arrays;

/**
 * PROBLEM 5 — Advanced
 * Fantasy League Auto-Draft Ranking Engine
 *
 * An auto-draft feature needs to decide which players are draftable and
 * rank them by fantasy points. The draft rule isn't one simple cutoff:
 * - A player with a long track record qualifies on experience alone.
 * - A newer player still needs to be both reasonably experienced AND
 *   currently fit to make the cut.
 *
 * Topics: Arrays, Method Overloading, Static Methods,
 *         Standard Library (Arrays.sort), Constructors & Encapsulation
 */
public class FantasyLeagueAutoDraftRankingEngine {

    /**
     * Inner class representing a Player who implements Comparable
     * so Arrays.sort() alone can rank the draftable array by fantasy
     * points (descending).
     */
    static class Player implements Comparable<Player> {
        private String name;
        private int matchesPlayed;
        private double battingAverage;
        private boolean injured;

        public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.injured = injured;
        }

        public String getName() {
            return name;
        }

        public int getMatchesPlayed() {
            return matchesPlayed;
        }

        public double getBattingAverage() {
            return battingAverage;
        }

        public boolean isInjured() {
            return injured;
        }

        /**
         * Sorts by batting average descending (higher fantasy points first).
         */
        @Override
        public int compareTo(Player other) {
            return Double.compare(other.battingAverage, this.battingAverage);
        }
    }

    /**
     * Experience-only rule: established players with >= 10 matches
     * qualify regardless of fitness.
     */
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    /**
     * Combined fitness-and-matches rule: newer players need at least
     * 5 matches AND must not be injured.
     */
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    /**
     * Filters draftable players (using both overloaded rules),
     * sorts them by fantasy points descending, and returns a
     * ranked string.
     */
    static String draftAndRank(Player[] players) {
        // First pass: count draftable players
        int count = 0;
        for (Player p : players) {
            if (isDraftable(p.getMatchesPlayed()) ||
                    isDraftable(p.getMatchesPlayed(), p.isInjured())) {
                count++;
            }
        }

        // Second pass: collect draftable players
        Player[] draftable = new Player[count];
        int idx = 0;
        for (Player p : players) {
            if (isDraftable(p.getMatchesPlayed()) ||
                    isDraftable(p.getMatchesPlayed(), p.isInjured())) {
                draftable[idx++] = p;
            }
        }

        // Sort by fantasy points (batting average) descending
        Arrays.sort(draftable);

        // Build result string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < draftable.length; i++) {
            if (i > 0) {
                result.append(" | ");
            }
            result.append(i + 1).append(". ").append(draftable[i].getName());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Player[] players = {
                new Player("Virat", 15, 48.0, false),
                new Player("Rahul", 7, 55.0, false),
                new Player("Sameer", 3, 60.0, false),
                new Player("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
        // Expected: 1. Rahul | 2. Virat | 3. Dev
        //
        // Explanation:
        // - Virat (15 matches) → experience-only rule clears
        // - Dev (12 matches, injured) → experience-only rule clears
        // - Rahul (7 matches, not injured) → combined rule clears
        // - Sameer (3 matches) → neither rule clears → excluded
        // Sorted by batting average desc: Rahul(55) > Virat(48) > Dev(20)
    }
}

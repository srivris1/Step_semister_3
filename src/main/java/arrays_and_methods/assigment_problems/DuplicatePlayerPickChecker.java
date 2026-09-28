package arrays_and_methods.assigment_problems;

/**
 * PROBLEM 2 — Easy
 * Duplicate Player Pick Checker
 *
 * A glitch in the fantasy app's draft screen occasionally lets a user tap
 * the same player twice before the UI catches up, silently adding them to
 * the lineup twice. This method checks a submitted lineup for a repeated
 * player name before it's accepted.
 *
 * Topics: Arrays, Strings, Nested Loops
 */
public class DuplicatePlayerPickChecker {

    /**
     * Compares every name against every other name using plain nested loops
     * — no Collections class of any kind.
     * Reports the first duplicate found, scanning in order; if none exist,
     * says so clearly.
     *
     * @param playerNames the submitted lineup of player names
     * @return "Duplicate Found: <name>" or "No Duplicates Found"
     */
    static String findDuplicatePick(String[] playerNames) {
        for (int i = 0; i < playerNames.length; i++) {
            for (int j = i + 1; j < playerNames.length; j++) {
                if (playerNames[i].equals(playerNames[j])) {
                    return "Duplicate Found: " + playerNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        // Test 1: Duplicate exists
        String[] lineup1 = {"Kohli", "Bumrah", "Kohli", "Rohit"};
        System.out.println(findDuplicatePick(lineup1));
        // Expected: Duplicate Found: Kohli

        // Test 2: No duplicates
        String[] lineup2 = {"Kohli", "Bumrah", "Rohit"};
        System.out.println(findDuplicatePick(lineup2));
        // Expected: No Duplicates Found
    }
}

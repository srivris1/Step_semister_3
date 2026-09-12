package string_and_array_basics.assigment_problems;

import java.util.Scanner;

/**
 * Problem 4: The Warehouse Inventory Balancer
 *
 * Scenario: A retail warehouse stores the same product categories across two storage
 * sections, Section A and Section B. The inventory team wants to confirm both sections
 * hold matching total quantities and also identify the single highest-quantity item.
 *
 * Task: Accept two integer arrays of equal length, compute totals, compare them,
 * and find the highest quantity value with its section and index.
 */
public class WarehouseInventoryBalancer {

    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0, totalB = 0;

        for (int val : sectionA) totalA += val;
        for (int val : sectionB) totalB += val;

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        // Find highest quantity across both sections
        int highestVal = Integer.MIN_VALUE;
        String highestSection = "";
        int highestIndex = -1;

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highestVal) {
                highestVal = sectionA[i];
                highestSection = "Section A";
                highestIndex = i + 1; // 1-indexed
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highestVal) {
                highestVal = sectionB[i];
                highestSection = "Section B";
                highestIndex = i + 1;
            }
        }

        System.out.println("Section A Total: " + totalA +
                " | Section B Total: " + totalB +
                " | Status: " + status +
                " | Highest Quantity: " + highestVal +
                " (" + highestSection + ", Item " + highestIndex + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] sectionA = new int[n];
        int[] sectionB = new int[n];

        System.out.print("Enter Section A quantities: ");
        for (int i = 0; i < n; i++) sectionA[i] = sc.nextInt();

        System.out.print("Enter Section B quantities: ");
        for (int i = 0; i < n; i++) sectionB[i] = sc.nextInt();

        analyzeInventory(sectionA, sectionB);
        sc.close();
    }
}

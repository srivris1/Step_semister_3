package string_methods.assigment_problems;

import java.util.Scanner;

/**
 * Problem 3: Product Inventory CSV Parser
 *
 * Scenario: The warehouse team receives inventory updates as CSV lines and
 * needs a quick parser to split each line into fields and print a formatted record.
 *
 * Task: Accept a CSV line "ProductName,SKU,Quantity", validate that exactly 3 fields
 * are present, and print formatted output.
 */
public class ProductInventoryCsvParser {

    public static void parseInventoryRecord(String csvLine) {
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
        } else {
            System.out.println("Product: " + fields[0].trim() +
                    " | SKU: " + fields[1].trim() +
                    " | Qty: " + fields[2].trim());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CSV line: ");
        String csvLine = sc.nextLine();
        parseInventoryRecord(csvLine);
        sc.close();
    }
}

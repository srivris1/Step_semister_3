package classes_and_objects.assigment_problems;

/**
 * M1. Library Inventory Management
 *
 * The library currently tracks its book inventory using three parallel arrays
 * — titles, authors, copiesAvailable — and a recount last week already went
 * out of sync. Rebuild it the OOP way.
 *
 * Topics: Classes, Constructors, Instance Methods, Arrays of Objects
 */
public class LibraryBookCatalog {

    public static void main(String[] args) {
        BookInventory[] catalog = {
                new BookInventory("Clean Code", "Robert C. Martin", 3),
                new BookInventory("Effective Java", "Joshua Bloch", 5),
                new BookInventory("Refactoring", "Martin Fowler", 0),
                new BookInventory("Design Patterns", "GoF", 2)
        };

        for (BookInventory book : catalog) {
            book.printEntry();
        }
        // Expected output:
        // Clean Code by Robert C. Martin - 3 copies available
        // Effective Java by Joshua Bloch - 5 copies available
        // Refactoring by Martin Fowler - 0 copies available
        // Design Patterns by GoF - 2 copies available
    }
}

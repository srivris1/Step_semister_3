package classes_and_objects.assigment_problems;

/**
 * BookInventory class for M1 — Library Inventory Management.
 *
 * Fields: title, author, copiesAvailable
 * Constructor sets all three fields.
 * Instance method printEntry() prints one formatted line.
 */
public class BookInventory {

    String title;
    String author;
    int copiesAvailable;

    /**
     * Constructs a BookInventory entry with the given title, author,
     * and number of copies available.
     */
    public BookInventory(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    /**
     * Prints one formatted line for this book entry.
     */
    void printEntry() {
        System.out.println(title + " by " + author + " - " + copiesAvailable + " copies available");
    }
}

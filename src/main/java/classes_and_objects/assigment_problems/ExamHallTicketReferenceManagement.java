package classes_and_objects.assigment_problems;

/**
 * M4. Exam Hall Ticket Reference Management — Driver class
 *
 * Two "different" variables both claim to represent Priya's exam hall ticket,
 * but only one of them is actually real. Prove it with code.
 *
 * Demonstrates: reference assignment vs new object creation, == identity check
 *
 * Topics: Object References, == vs .equals()
 */
public class ExamHallTicketReferenceManagement {

    public static void main(String[] args) {
        // Create one HallTicket object for Priya
        HallTicket priya = new HallTicket("Priya", 0);

        // Assign a second variable to point at the SAME object (no new)
        HallTicket copy = priya;

        // Through the second variable, change seatNumber
        copy.seatNumber = 45;

        // Print the field's value as seen through the FIRST variable
        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);
        // Expected: 45

        // Print whether the two variables are == to each other
        System.out.println("copy == priya: " + (copy == priya));
        // Expected: true

        // Create a third, SEPARATE HallTicket object with identical field values
        HallTicket separate = new HallTicket("Priya", 45);

        // Print whether it is == to the first
        System.out.println("separate == priya: " + (separate == priya));
        // Expected: false
    }
}

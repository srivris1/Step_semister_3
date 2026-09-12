package classes_and_objects.assigment_problems;

/**
 * HallTicket class for M4 — Exam Hall Ticket Reference Management.
 *
 * Demonstrates object reference vs object value identity:
 * - Two variables pointing at the same object (== is true)
 * - A separate object with identical field values (== is false)
 *
 * Topics: Object References, == vs .equals(), Reference Assignment
 */
public class HallTicket {

    String studentName;
    int seatNumber;

    /**
     * Constructs a HallTicket with the given student name and seat number.
     */
    public HallTicket(String studentName, int seatNumber) {
        this.studentName = studentName;
        this.seatNumber = seatNumber;
    }
}

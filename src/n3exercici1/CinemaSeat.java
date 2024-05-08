package n3exercici1;

public class CinemaSeat {
    private int rowNumber;
    private int seatNumber;
    private String bookingName;

    public CinemaSeat(int rowNumber, int seatNumber, String bookingName) {
        this.rowNumber = rowNumber;
        this.seatNumber = seatNumber;
        this.bookingName = bookingName;
    }

    public int getRowNumber() {
        return this.rowNumber;
    }
    public int getSeatNumber() {
        return this.seatNumber;
    }
    public String getBookingName() {
        return this.bookingName;
    }

    public boolean equals() {
        return getRowNumber() == getSeatNumber();
    }

    @Override
    public String toString() {
        return "Row: " + getRowNumber() + ", Seat Number: " + getSeatNumber() + ", Person: " + getBookingName();
    }
}

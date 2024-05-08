package n3exercici1;

import java.util.Scanner;

public class Cinema {
    static Scanner scanner = new Scanner(System.in);

    private int rows;
    private int seats;
    private SeatManagement seatManagement;

    public Cinema() {
        SeatManagement seatManagement = new SeatManagement();
        getInitialData();
    }

    public void start() {

    }

    public int menu() {
        int choice = 0;
        System.out.println("Choose an option:\n"
        + "1.- Show all booked seats."
        + "2.- Show all booked seats by one person."
        + "3.- Book a seat."
        + "4.- Cancel a booking for a seat."
        + "5.- Cancel all booking from one person."
        + "0.- Exit");
        choice = scanner.nextInt();

        return choice;
    }

    public void showBookedSeats() {}

    public void showBookedSeatsByPerson() {}

    public void bookSeat() {}

    public void cancelBooking() {}

    public void cancelBookingPerson() {}

    public void addPerson() {}

    public void getInitialData() {}

    public void addRow() {}

    public void addSeat() {}

}

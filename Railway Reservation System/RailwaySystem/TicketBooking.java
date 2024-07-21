package RailwaySystem;

import java.util.ArrayList;

public class TicketBooking {

    private static int berthLimit = 4 / 2;

    private static int upperSeatNumber = 1;
    private static int lowerSeatNumber = 2;

    static ArrayList<Passenger> bookedList = new ArrayList<>();

    static ArrayList<Passenger> upperList = new ArrayList<>();
    static ArrayList<Passenger> lowerList = new ArrayList<>();

    public static void bookTicket(Passenger p) {
        if (upperList.size() == berthLimit && lowerList.size() == berthLimit) {
            System.out.println("Ticket Not Avaiable");
        } else if (checkAvailability(p)) {
            System.out.println(" \nBooking Confirmed \nYour ticket id is : " + p.getId());
            bookedList.add(p);
        } else {
            System.out.println(p.getPreference() + " is not Available");
            p.setId(p.getId() - 1);
            AvailableList();
        }
    }

    private static void AvailableList() {
        System.out.println("Check out the Number of seats Available: ");
        System.out.println("Upper Birth : " + (berthLimit - upperList.size()));
        System.out.println("LowerLimit :" + (berthLimit - lowerList.size()));
    }

    public static boolean checkAvailability(Passenger p) {
        if (upperList.size() < berthLimit) {

            if (p.getPreference() == 'U') {
                p.setSeatNumber(upperSeatNumber);
                upperSeatNumber += 2;

            }
            upperList.add(p);
            return true;
        }

        else {
            if (p.getPreference() == 'L') {
                if (lowerList.size() < berthLimit) {
                    p.setSeatNumber(lowerSeatNumber);
                    lowerSeatNumber += 2;
                }
                lowerList.add(p);
                return true;
            }

        }
        return false;

    }

    public static void displayConfirmed() {
        System.out.println("-------------------------");
        for (Passenger p : bookedList) {
            System.out.println(p.toString());
            System.out.println("-------------------------");
        }
    }

}

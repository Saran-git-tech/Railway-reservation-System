package RailwaySystem;

public class TicketCancel extends TicketBooking {

    public static String canceling(int id) {
        for (Passenger p : bookedList) {
            if (p.getId() == id) {
                cancel(p);
                return "Success";
            }
        }
        return "InValid";

    }

    private static void cancel(Passenger p) {
        deleteFromAllLists(p);
    }

    private static void deleteFromAllLists(Passenger p) {

        bookedList.remove(p);
        upperList.remove(p);
        lowerList.remove(p);
    }

}

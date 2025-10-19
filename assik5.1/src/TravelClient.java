import java.util.List;

public class TravelClient {
    public static void main(String[] args) {
        TravelFacade travel = new TravelFacade();

        TripRequest req = new TripRequest(
                "Almaty", "Istanbul",
                "2025-11-01", "2025-11-06",
                2, true
        );

        TravelReceipt booked = travel.planTrip(req);
        System.out.println("Booked refs  : " + booked.confirmations());
        System.out.println("Note         : " + booked.note());
        System.out.println("Success      : " + booked.ok());

        System.out.println();

        TravelReceipt cancelled = travel.cancelTrip(booked.confirmations());
        System.out.println("Cancelled refs: " + cancelled.confirmations());
        System.out.println("Note          : " + cancelled.note());
    }
}
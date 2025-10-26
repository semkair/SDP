public class Demo {
    public static void main(String[] args) {
        TripContext ctx = new TripContext(
                "ALA", "IST",
                "2025-11-10", "2025-11-15",
                2, true
        );

        Planner planner = new Planner();

        planner.setActivity(new FlightBookingActivity());
        planner.executeActivity(ctx);

        planner.setActivity(new HotelBookingActivity());
        planner.executeActivity(ctx);

        planner.setActivity(new CarRentalActivity());
        planner.executeActivity(ctx);

        planner.setActivity(new ItineraryEmailActivity());
        planner.executeActivity(ctx);
    }
}
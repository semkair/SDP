public class FlightBookingActivity implements TravelActivity {
    @Override
    public void perform(TripContext ctx) {
        System.out.printf("Flight: %s -> %s for %d traveler(s)%n",
                ctx.fromCity(), ctx.toCity(), ctx.travelers());
    }
}
public class HotelBookingActivity implements TravelActivity {
    @Override
    public void perform(TripContext ctx) {
        System.out.printf("Hotel: %s to %s in %s for %d traveler(s)%n",
                ctx.checkInDate(), ctx.checkOutDate(), ctx.toCity(), ctx.travelers());
    }
}
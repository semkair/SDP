public class ItineraryEmailActivity implements TravelActivity {
    @Override
    public void perform(TripContext ctx) {
        System.out.printf("Itinerary: send summary for %s -> %s (%s to %s)%n",
                ctx.fromCity(), ctx.toCity(), ctx.checkInDate(), ctx.checkOutDate());
    }
}

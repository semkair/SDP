public class CarRentalActivity implements TravelActivity {
    @Override
    public void perform(TripContext ctx) {
        if (ctx.needsCar()) {
            System.out.printf("Car: rent in %s from %s to %s%n",
                    ctx.toCity(), ctx.checkInDate(), ctx.checkOutDate());
        } else {
            System.out.println("Car: not needed");
        }
    }
}
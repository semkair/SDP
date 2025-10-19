import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TravelFacade {
    private final FlightBooking flight;
    private final HotelBooking hotel;
    private final CarRental car;

    public TravelFacade(FlightBooking flight, HotelBooking hotel, CarRental car) {
        this.flight = Objects.requireNonNull(flight);
        this.hotel  = Objects.requireNonNull(hotel);
        this.car    = Objects.requireNonNull(car);
    }

    public TravelFacade() { this(new FlightBooking(), new HotelBooking(), new CarRental()); }

    public TravelReceipt planTrip(TripRequest req) {
        List<String> refs = new ArrayList<>();

        String flightRef = flight.bookFlight(req.fromCity(), req.toCity(), req.travelers());
        refs.add(flightRef);

        String hotelRef = hotel.reserveRoom(req.toCity(), req.checkInDate(), req.checkOutDate(), req.travelers());
        refs.add(hotelRef);

        if (req.needsCar()) {
            String carRef = car.rentCar(req.toCity(), req.checkInDate(), req.checkOutDate());
            refs.add(carRef);
        }

        return new TravelReceipt(refs, "Trip planned for " + req.travelers() + " traveler(s).");
    }

    public TravelReceipt cancelTrip(List<String> confirmations) {
        List<String> cancels = new ArrayList<>();
        for (String c : confirmations) {
            if (c.startsWith("FLIGHT-")) cancels.add(flight.cancelFlight(c));
            else if (c.startsWith("HOTEL-")) cancels.add(hotel.cancelReservation(c));
            else if (c.startsWith("CAR-")) cancels.add(car.cancelRental(c));
        }
        return new TravelReceipt(cancels, "All segments requested for cancellation.");
    }
}
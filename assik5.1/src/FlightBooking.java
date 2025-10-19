public class FlightBooking {
    public String bookFlight(String fromCity, String toCity, int travelers) {
        return "FLIGHT-" + fromCity + "-" + toCity + "-" + travelers;
    }
    public String cancelFlight(String confirmation) {
        return "CANCELLED-" + confirmation;
    }
}
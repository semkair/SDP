public record TripRequest(
        String fromCity,
        String toCity,
        String checkInDate,
        String checkOutDate,
        int travelers,
        boolean needsCar ) {}

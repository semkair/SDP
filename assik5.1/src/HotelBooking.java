public class HotelBooking {
    public String reserveRoom(String city, String checkIn, String checkOut, int travelers) {
        int rooms = Math.max(1, (int)Math.ceil(travelers / 2.0));
        return "HOTEL-" + city + "-" + checkIn + "-" + checkOut + "-rooms" + rooms;
    }
    public String cancelReservation(String confirmation) {
        return "CANCELLED-" + confirmation;
    }
}
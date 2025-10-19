public class CarRental {
    public String rentCar(String city, String fromDate, String toDate) {
        return "CAR-" + city + "-" + fromDate + "-" + toDate;
    }
    public String cancelRental(String confirmation) {
        return "CANCELLED-" + confirmation;
    }
}
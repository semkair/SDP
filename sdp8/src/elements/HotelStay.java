package elements;

import visitors.TravelVisitor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class HotelStay implements TravelElement {
    private final String city;
    private final LocalDate checkIn;
    private final LocalDate checkOut;
    private final double ratePerNight;

    public HotelStay(String city, LocalDate checkIn, LocalDate checkOut, double ratePerNight) {
        this.city = Objects.requireNonNull(city);
        this.checkIn = Objects.requireNonNull(checkIn);
        this.checkOut = Objects.requireNonNull(checkOut);
        this.ratePerNight = ratePerNight;
    }

    public String city() { return city; }
    public LocalDate checkIn() { return checkIn; }
    public LocalDate checkOut() { return checkOut; }
    public int nights() { return Math.max(1, (int) ChronoUnit.DAYS.between(checkIn, checkOut)); }
    public double ratePerNight() { return ratePerNight; }

    @Override public void accept(TravelVisitor v) { v.visit(this); }
}
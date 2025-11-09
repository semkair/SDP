package elements;

import visitors.TravelVisitor;

import java.util.Objects;

public class FlightSegment implements TravelElement {
    private final String fromCity;
    private final String toCity;
    private final int travelers;
    private final double pricePerPerson;

    public FlightSegment(String fromCity, String toCity, int travelers, double pricePerPerson) {
        if (travelers <= 0) throw new IllegalArgumentException("travelers must be >= 1");
        this.fromCity = Objects.requireNonNull(fromCity);
        this.toCity = Objects.requireNonNull(toCity);
        this.travelers = travelers;
        this.pricePerPerson = pricePerPerson;
    }

    public String fromCity() { return fromCity; }
    public String toCity() { return toCity; }
    public int travelers() { return travelers; }
    public double pricePerPerson() { return pricePerPerson; }

    @Override public void accept(TravelVisitor v) { v.visit(this); }
}
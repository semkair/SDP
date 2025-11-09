package elements;

import visitors.TravelVisitor;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class CarHire implements TravelElement {
    private final String city;
    private final LocalDate fromDate;
    private final LocalDate toDate;
    private final double ratePerDay;

    public CarHire(String city, LocalDate fromDate, LocalDate toDate, double ratePerDay) {
        this.city = Objects.requireNonNull(city);
        this.fromDate = Objects.requireNonNull(fromDate);
        this.toDate = Objects.requireNonNull(toDate);
        this.ratePerDay = ratePerDay;
    }

    public String city() { return city; }
    public LocalDate fromDate() { return fromDate; }
    public LocalDate toDate() { return toDate; }
    public int days() { return Math.max(1, (int) ChronoUnit.DAYS.between(fromDate, toDate)); }
    public double ratePerDay() { return ratePerDay; }

    @Override public void accept(TravelVisitor v) { v.visit(this); }
}
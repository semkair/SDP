package visitors;

import elements.CarHire;
import elements.FlightSegment;
import elements.HotelStay;
import elements.Itinerary;

final class CostCalculatorVisitor implements TravelVisitor {
    private double total;

    @Override public void visit(Itinerary it) { /* no-op */ }
    @Override public void visit(FlightSegment f) { total += f.pricePerPerson() * f.travelers(); }
    @Override public void visit(HotelStay h) { total += h.ratePerNight() * h.nights(); }
    @Override public void visit(CarHire c) { total += c.ratePerDay() * c.days(); }

    public double total() { return total; }
}
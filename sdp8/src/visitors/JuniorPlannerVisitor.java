package visitors;

import elements.*;

public class JuniorPlannerVisitor implements TravelVisitor {
    @Override public void visit(Itinerary it) {
        System.out.println("Junior: preparing itinerary for " + it.travelerName());
    }
    @Override public void visit(FlightSegment f) {
        System.out.println("Junior: book flight " + f.fromCity() + " -> " + f.toCity()
                + " for " + f.travelers() + " pax @ $" + String.format("%.2f", f.pricePerPerson()));
    }
    @Override public void visit(HotelStay h) {
        System.out.println("Junior: reserve hotel in " + h.city()
                + " for " + h.nights() + " night(s) @ $" + String.format("%.2f/night", h.ratePerNight()));
    }
    @Override public void visit(CarHire c) {
        System.out.println("Junior: rent car in " + c.city()
                + " for " + c.days() + " day(s) @ $" + String.format("%.2f/day", c.ratePerDay()));
    }
}
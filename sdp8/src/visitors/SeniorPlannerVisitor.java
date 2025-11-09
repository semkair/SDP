package visitors;


import elements.CarHire;
import elements.FlightSegment;
import elements.HotelStay;
import elements.Itinerary;

public class SeniorPlannerVisitor implements TravelVisitor {
    @Override public void visit(Itinerary it) {
        System.out.println("Senior: validate itinerary for " + it.travelerName());
        if (it.items().isEmpty()) System.out.println("Senior: warning — empty itinerary");
    }
    @Override public void visit(FlightSegment f) {
        if (f.fromCity().equalsIgnoreCase(f.toCity()))
            System.out.println("Senior: error — flight origin equals destination");
        System.out.println("Senior: add priority boarding for " + f.travelers() + " pax");
    }
    @Override public void visit(HotelStay h) {
        if (!h.checkOut().isAfter(h.checkIn()))
            System.out.println("Senior: error — checkout must be after checkin");
        System.out.println("Senior: request late checkout if available");
    }
    @Override public void visit(CarHire c) {
        if (!c.toDate().isAfter(c.fromDate()))
            System.out.println("Senior: error — car hire end must be after start");
        System.out.println("Senior: add GPS and basic insurance");
    }
}
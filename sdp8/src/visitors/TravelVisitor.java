package visitors;

import elements.HotelStay;
import elements.CarHire;
import elements.FlightSegment;
import elements.Itinerary;

public interface TravelVisitor {
    void visit(HotelStay hotel);
    void visit(CarHire car);
    void visit(FlightSegment flight);
    void visit(Itinerary itinerary);
}
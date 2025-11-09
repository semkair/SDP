package visitors;

import elements.*;

import java.time.LocalDate;

public class DemoVisitor {
    public static void main(String[] args) {
        Itinerary trip = new Itinerary("Ada Lovelace");
        trip.add(new FlightSegment("ALA", "IST", 2, 335.00));
        trip.add(new HotelStay("IST", LocalDate.now().plusDays(10), LocalDate.now().plusDays(15), 92.50));
        trip.add(new CarHire("IST", LocalDate.now().plusDays(10), LocalDate.now().plusDays(15), 34.00));

        TravelVisitor junior = new JuniorPlannerVisitor();
        TravelVisitor senior = new SeniorPlannerVisitor();
        CostCalculatorVisitor cost = new CostCalculatorVisitor();

        trip.accept(junior);
        System.out.println("---");
        trip.accept(senior);
        System.out.println("---");
        trip.accept(cost);
        System.out.printf("TOTAL: $%.2f%n", cost.total());
    }
}
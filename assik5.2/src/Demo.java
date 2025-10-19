public class Demo {
    public static void main(String[] args) {
        Itinerary plan = new BreakfastItinerary(
                new TeamLeadItinerary(
                        new InsuredItinerary(
                                new BasicItinerary()
                        )));

        System.out.println(plan.makePlan());
    }
}
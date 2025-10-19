public final class InsuredItinerary extends ItineraryDecorator {

    public InsuredItinerary(Itinerary inner) {
        super(inner);
    }

    private String addInsurance() {
        return " + travel insurance";
    }

    @Override
    public String makePlan() {
        return super.makePlan() + addInsurance();
    }
}
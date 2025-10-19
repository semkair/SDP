public final class TeamLeadItinerary extends ItineraryDecorator {

    public TeamLeadItinerary(Itinerary inner) {
        super(inner);
    }

    private String leadLogistics() {
        return " + coordinate transfers and check-in";
    }

    @Override
    public String makePlan() {
        return super.makePlan() + leadLogistics();
    }
}
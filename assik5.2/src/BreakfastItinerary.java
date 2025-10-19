public final class BreakfastItinerary extends ItineraryDecorator {

    public BreakfastItinerary(Itinerary inner) {
        super(inner);
    }

    private String addBreakfast() {
        return " + hotel breakfast";
    }

    @Override
    public String makePlan() {
        return super.makePlan() + addBreakfast();
    }
}
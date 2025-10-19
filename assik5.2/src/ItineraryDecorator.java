public abstract class ItineraryDecorator implements Itinerary {
    protected final Itinerary inner;

    protected ItineraryDecorator(Itinerary inner) {
        if (inner == null) throw new IllegalArgumentException("inner cannot be null");
        this.inner = inner;
    }

    @Override
    public String makePlan() {
        return inner.makePlan();
    }
}
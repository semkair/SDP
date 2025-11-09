package elements;

import visitors.TravelVisitor;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Objects;

public class Itinerary implements TravelElement {
    private final String travelerName;
    private final List<TravelElement> items = new ArrayList<>();

    public Itinerary(String travelerName) {
        this.travelerName = Objects.requireNonNull(travelerName);
    }

    public String travelerName() { return travelerName; }
    public List<TravelElement> items() { return Collections.unmodifiableList(items); }
    public void add(TravelElement e) { items.add(Objects.requireNonNull(e)); }

    @Override
    public void accept(TravelVisitor v) {
        v.visit(this);
        for (TravelElement e : items) {
            e.accept(v);
        }
    }
}
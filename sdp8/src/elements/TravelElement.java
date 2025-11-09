package elements;

import visitors.TravelVisitor;

public interface TravelElement {
    void accept(TravelVisitor visitor);
}
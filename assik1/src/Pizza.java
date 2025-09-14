
public class Pizza {
    private final String dough;
    private final String sauce;
    private final String topping;
    private final boolean cheese;

    private Pizza(Builder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
        this.cheese = builder.cheese;
    }

    @Override
    public String toString() {
        return "Pizza with " + dough + " dough, " +
                sauce + " sauce, " +
                topping + " topping, " +
                (cheese ? "with cheese" : "no cheese");
    }

    public static class Builder {
        private String dough;
        private String sauce;
        private String topping;
        private boolean cheese;

        public Builder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Builder addCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
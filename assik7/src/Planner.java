import java.util.Objects;

public class Planner {
    private TravelActivity activity;

    public Planner() { }

    public Planner(TravelActivity activity) {
        this.activity = Objects.requireNonNull(activity, "activity");
    }

    public void setActivity(TravelActivity activity) {
        this.activity = Objects.requireNonNull(activity, "activity");
    }

    public void executeActivity(TripContext ctx) {
        if (activity == null) throw new IllegalStateException("Activity not set");
        activity.perform(ctx);
    }
}
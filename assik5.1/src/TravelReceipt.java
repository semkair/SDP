import java.util.List;

public record TravelReceipt(List<String> confirmations, String note) {
    public boolean ok() { return confirmations != null && !confirmations.isEmpty(); }
}
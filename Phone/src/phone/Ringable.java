package phone;

public interface Ringable {
    public default String ring() {
        return "Ping Ping Ping";
    }
    public default String unlock() {
        return "Phone unlocked";
    }
}

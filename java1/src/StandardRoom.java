public class StandardRoom extends Room {
    private boolean hasView;

    public StandardRoom(int roomNumber, double pricePerNight, boolean hasView) {
        super(roomNumber, pricePerNight);
        this.hasView = hasView;
    }

    @Override
    public String getRoomType() {
        return hasView ? "Standard (City View)" : "Standard (No View)";
    }
}

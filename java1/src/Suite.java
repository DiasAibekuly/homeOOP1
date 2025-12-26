public class Suite extends Room {
    private boolean hasJacuzzi;

    public Suite(int roomNumber, double pricePerNight, boolean hasJacuzzi) {
        super(roomNumber, pricePerNight);
        this.hasJacuzzi = hasJacuzzi;
    }

    @Override
    public String getRoomType() {
        return hasJacuzzi ? "Luxury Suite (+Jacuzzi)" : "Junior Suite";
    }
}

public class Booking {
    private Room room;
    private Guest guest;
    private int nights;

    public Booking(Room room, Guest guest, int nights) {
        this.room = room;
        this.guest = guest;
        this.nights = nights;
    }

    public double calculateTotalCost() {
        return room.getPricePerNight() * nights;
    }

    public void printDetails() {
        System.out.println("Guest: " + guest.getFullName() + "  " + guest.getGuestId());
        System.out.println("Accommodation: " + room.toString());
        System.out.println("Duration: " + nights + " nights");
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}

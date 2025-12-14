//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// File name: Main.java

public class Main {
    public static void main(String[] args) {
        Room room101 = new Room(101, "Standard", 100.0);
        Room room202 = new Room(202, "Deluxe", 200.0);

        Guest guest1 = new Guest("John Doe", "ID-001");
        Guest guest2 = new Guest("Alice Smith", "ID-002");

        Booking booking1 = new Booking(room101, guest1, 3);
        Booking booking2 = new Booking(room202, guest2, 2);

        System.out.println("=== Booking Details 1 ===");
        booking1.printDetails();

        System.out.println("\n=== Booking Details 2 ===");
        booking2.printDetails();

        System.out.println("\n=== Comparison Results ===");

        if (booking1.calculateTotalCost() > booking2.calculateTotalCost()) {
            System.out.println("Booking #1 is more expensive than Booking #2");
        } else if (booking1.calculateTotalCost() < booking2.calculateTotalCost()) {
            System.out.println("Booking #2 is more expensive than Booking #1");
        } else {
            System.out.println("Both bookings have the same cost");
        }
    }
}

class Room {
    private int roomNumber;
    private String type;
    private double pricePerNight;

    public Room(int roomNumber, String type, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.pricePerNight = pricePerNight;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getRoomInfo() {
        return "Room #" + roomNumber + " (" + type + ")";
    }
}

class Guest {
    private String fullName;
    private String guestId;


    public Guest(String fullName, String guestId) {
        this.fullName = fullName;
        this.guestId = guestId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

class Booking {
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
        System.out.println("Guest: " + guest.getFullName()+"  "+ guest.getGuestId());
        System.out.println("Accommodation: " + room.getRoomInfo());
        System.out.println("Duration: " + nights + " nights");
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// File name: Main.java

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotelManager manager = new HotelManager();

        Room room101 = new StandardRoom(101, 100.0, false);
        Room room202 = new Suite(202, 200.0, true);
        Room room303 = new StandardRoom(303, 150.0, true);

        manager.addRoom(room101);
        manager.addRoom(room202);
        manager.addRoom(room303);

        Guest guest1 = new Guest("John Doe", "ID-001");
        Guest guest2 = new Guest("Alice Smith", "ID-002");

        Booking booking1 = new Booking(room101, guest1, 3);
        Booking booking2 = new Booking(room202, guest2, 2);

        System.out.println("=== Booking Details 1 ===");
        booking1.printDetails();

        System.out.println("\n=== Booking Details 2 ===");
        booking2.printDetails();

        System.out.println("\n=== Hotel Manager Functions ===");

        System.out.println("-> Sorted Rooms by Price:");
        manager.sortRoomsByPrice();
        manager.printAllRooms();
    }
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HotelManager {
    private List<Room> rooms;

    public HotelManager() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room searchRoomByNumber(int number) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == number) {
                return room;
            }
        }
        return null;
    }

    public List<Room> filterRoomsByMaxPrice(double maxPrice) {
        List<Room> result = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getPricePerNight() <= maxPrice) {
                result.add(room);
            }
        }
        return result;
    }

    public void sortRoomsByPrice() {
        Collections.sort(rooms, Comparator.comparingDouble(Room::getPricePerNight));
    }

    public void printAllRooms() {
        for (Room room : rooms) {
            System.out.println(room.toString());
        }
    }
}
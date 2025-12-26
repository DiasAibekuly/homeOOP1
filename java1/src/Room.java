import java.util.Objects;

public abstract class Room implements Comparable<Room> {
    private int roomNumber;
    private double pricePerNight;

    public Room(int roomNumber, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public abstract String getRoomType();

    @Override
    public String toString() {
        return "Room #" + roomNumber + " [" + getRoomType() + "] - $" + pricePerNight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber == room.roomNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomNumber);
    }

    @Override
    public int compareTo(Room other) {
        return Integer.compare(this.roomNumber, other.roomNumber);
    }
}

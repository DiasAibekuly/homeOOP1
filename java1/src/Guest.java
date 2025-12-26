import java.util.Objects;

public class Guest {
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

    @Override
    public String toString() {
        return "Guest{name='" + fullName + "', id='" + guestId + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(guestId, guest.guestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guestId);
    }
}
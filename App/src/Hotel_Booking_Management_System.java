import java.util.HashMap;
import java.util.Map;

/**
 * ============================================================
 * ABSTRACT CLASS – Room
 * ============================================================
 */
abstract class Room {

    protected int numberOfBeds;
    protected int squareFeet;
    protected double pricePerNight;

    public Room(int beds, int size, double price) {
        this.numberOfBeds = beds;
        this.squareFeet = size;
        this.pricePerNight = price;
    }
}

/**
 * ============================================================
 * CLASS – SingleRoom
 * ============================================================
 */
class SingleRoom extends Room {

    public SingleRoom() {
        super(1, 250, 1500.0);
    }
}

/**
 * ============================================================
 * CLASS – DoubleRoom
 * ============================================================
 */
class DoubleRoom extends Room {

    public DoubleRoom() {
        super(2, 400, 2500.0);
    }
}

/**
 * ============================================================
 * CLASS – SuiteRoom
 * ============================================================
 */
class SuiteRoom extends Room {

    public SuiteRoom() {
        super(3, 750, 5000.0);
    }
}

/**
 * ============================================================
 * CLASS – RoomInventory
 * ============================================================
 */
class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        roomAvailability.put("Single Room", 5);
        roomAvailability.put("Double Room", 3);
        roomAvailability.put("Suite Room", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}

/**
 * ============================================================
 * MAIN CLASS – Hotel_Booking_Management_System
 * ============================================================
 */
public class Hotel_Booking_Management_System {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        SingleRoom single = new SingleRoom();
        DoubleRoom doubleRoom = new DoubleRoom();
        SuiteRoom suite = new SuiteRoom();

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Hotel Room Inventory Status\n");

        System.out.println("Single Room:");
        System.out.println("Beds: " + single.numberOfBeds);
        System.out.println("Size: " + single.squareFeet + " sqft");
        System.out.println("Price per night: " + single.pricePerNight);
        System.out.println("Available Rooms: " + availability.get("Single Room") + "\n");

        System.out.println("Double Room:");
        System.out.println("Beds: " + doubleRoom.numberOfBeds);
        System.out.println("Size: " + doubleRoom.squareFeet + " sqft");
        System.out.println("Price per night: " + doubleRoom.pricePerNight);
        System.out.println("Available Rooms: " + availability.get("Double Room") + "\n");

        System.out.println("Suite Room:");
        System.out.println("Beds: " + suite.numberOfBeds);
        System.out.println("Size: " + suite.squareFeet + " sqft");
        System.out.println("Price per night: " + suite.pricePerNight);
        System.out.println("Available Rooms: " + availability.get("Suite Room"));
    }
}
import java.util.ArrayList;
import java.util.List;

public class Project {
    public static void main(String[] args) {
        // สร้างโรงแรม
        Hotel hotel = new Hotel("My Hotel");

        // เพิ่มห้องพัก
        Room room1 = new Room("101", "Standard", 1000);
        Room room2 = new Room("102", "Deluxe", 1500);
        Room room3 = new Room("103", "spice", 2000);

        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);

        // สร้างลูกค้า
        Customer customer1 = new Customer("John Doe", "john@example.com", "123-456-7890");

        // ลูกค้าจองห้อง
        String checkInDate = "2023-09-20";
        String checkOutDate = "2023-09-25";

        Room selectedRoom = room1; // ในที่นี้เลือกห้อง room1
        if (selectedRoom.isAvailable(checkInDate, checkOutDate)) {
            Reservation reservation = new Reservation(customer1, selectedRoom, checkInDate, checkOutDate);
            System.out.println("Reservation for " + customer1.getName() + " is confirmed.");
        } else {
            System.out.println("Room " + selectedRoom.getRoomNumber() + " is not available for the selected dates.");
        }
    }
}


class Hotel {
    private String name;
    private List<Room> rooms;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    // เพิ่มเมทอดอื่น ๆ ตามความต้องการ
}

class Room {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;
    private boolean isAvailable;

    public Room(String roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
    }

    public boolean isAvailable(String checkInDate, String checkOutDate) {
        return false;
    }

    public String getRoomNumber() {
        return null;
    }

    // เพิ่มเมทอดอื่น ๆ ตามความต้องการ
}

class Reservation {
    private int reservationId;
    private Customer customer;
    private Room room;
    private String checkInDate;
    private String checkOutDate;

    private static int reservationCounter = 1;

    public Reservation(Customer customer, Room room, String checkInDate, String checkOutDate) {
        this.reservationId = reservationCounter++;
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // เพิ่มเมทอดอื่น ๆ ตามความต้องการ
}

class Customer {
    private String name;
    private String email;
    private String phone;

    public Customer(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return null;
    }

    // เพิ่มเมทอดอื่น ๆ ตามความต้องการ
}


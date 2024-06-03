package BonusTasksOOP;
public class HotelNumber extends HotelCompany{
protected int price;
    protected int roomNumber;
    protected boolean isAvailable;
    protected int capacity;

    public HotelNumber(int price, int roomNumber, boolean isAvailable, int capacity) {
        this.price = price;
        this.roomNumber = roomNumber;
        this.isAvailable = isAvailable;
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public String  toString(){
        System.out.println("------------------");
        return "Room Number: " + roomNumber + "\n" + "Price: " + price +"$ " + "\n" + "Capacity: " +  capacity;

    }
    public void getDetails () {
        System.out.println(toString());
    }
    public  void armorRoom(String guestName, int numberOfNights) {
        System.out.println("--------------------------");
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Room is not available.");
        }

    }
    public void clearningRoomService(String request) {
        System.out.println("Room Service cleaning today: " + request);
    }


}

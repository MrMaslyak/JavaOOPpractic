package BonusTasksOOP;

import java.util.ArrayList;

public class HotelCompany {
    protected ArrayList<HotelNumber> hotels = new ArrayList<>();
    public HotelCompany() {
        this.hotels = new ArrayList<>();
    }

    public ArrayList<HotelNumber> getHotels() {
        return hotels;
    }

    public void setHotels(ArrayList<HotelNumber> hotels) {
        this.hotels = hotels;
    }

    public void addRoom(HotelNumber addRoom) {
        System.out.println("-----------------");
        if (addRoom instanceof PremiumRoom) {
            if (addRoom.getCapacity() <= 3) {
                hotels.add(addRoom);
                System.out.println("Hotel added Premium room:\n" + addRoom);
            } else {
                System.out.println("Premium room can't have more than 3 rooms.");
            }
        } else if (addRoom instanceof LuxRoom) {
            if (addRoom.getCapacity() <= 4) {
                hotels.add(addRoom);
                System.out.println("Hotel added Lux room:\n" + addRoom);
            } else {
                System.out.println("Lux room can't have more than 4 rooms.");
            }
        } else {
            System.out.println("Invalid room type for the given capacity.");
        }
        System.out.println("-----------------");
    }
public void extraEquipment (String equipment, BookingOptions options){
    System.out.println("-----------------");

    boolean serviceProvided = false;

    if (equipment.trim().equalsIgnoreCase("extraMiniBed")) {
        options.setExtraMiniBed(true);
        System.out.println("Extra mini bed added");
        serviceProvided = true;
    }

    if (equipment.trim().equalsIgnoreCase("extraDoubleArmorSafe")) {
        options.setExtraDoubleArmorSafe(true);
        System.out.println("Extra double armor safe added");
        serviceProvided = true;

    }

    if (equipment.trim().equalsIgnoreCase("extraDishes")) {
        options.setExtraDishes(true);
        System.out.println("Extra dishes added");
        serviceProvided = true;
    }

    if (!serviceProvided) {
        System.out.println("We don't have this extra service");
    }

    System.out.println("-----------------");
}

    public void listRooms(){
       System.out.println("-----------------");
        System.out.println("List of hotels: ");
        for (HotelNumber hotel: hotels){
            System.out.println(hotel);
        }
       System.out.println("-----------------");
   }
}

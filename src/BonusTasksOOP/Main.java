package BonusTasksOOP;
public class Main {
    public static void main(String[] args) {
        HotelCompany company  = new HotelCompany();
        BookingOptions bookingOptions = new BookingOptions();
     PremiumRoom premiumRoom100  = new PremiumRoom(1000,100,true, 4);
     PremiumRoom premiumRoom101  = new PremiumRoom(1000,101,true, 2);
     LuxRoom luxRoom200 = new LuxRoom(2000, 200, true, 5);
     LuxRoom luxRoom201 = new LuxRoom(2000, 201, true, 3);
     company.addRoom(premiumRoom100);
     company.addRoom(premiumRoom101);
    company.addRoom(luxRoom200);
    company.addRoom(luxRoom201);
        System.out.println("******************************************************");
        premiumRoom101.armorRoom("Ilya", 7, bookingOptions);
       luxRoom201.armorRoom("Alex", 7, bookingOptions);
        System.out.println("******************************************************");
        premiumRoom101.armorRoom("Andrew", 10, bookingOptions);
        luxRoom201.armorRoom("Igor", 5, bookingOptions);
        System.out.println("******************************************************");
        premiumRoom101.clearningRoomService("Ilya", 17.30);
        System.out.println("--------");
        luxRoom201.clearningRoomService("Alex", 12.23, "clean floor");
        System.out.println("******************************************************");
        company.extraEquipment("ExtraMiniBed", bookingOptions);
        premiumRoom101.getDetails();
        luxRoom201.getDetails();
        company.listRooms();
    }
}

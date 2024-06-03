package BonusTasksOOP;

public class PremiumRoom extends HotelNumber {

    public PremiumRoom(int price, int roomNumber, boolean isAvailable, int capacity) {
        super(price , roomNumber, isAvailable, capacity);
    }
    public String toString(BookingOptions options) {
        return super.toString() + "\n" + "Mini Bar Included: " + options.minibarIncluded + "\n" + "Premium Bed Included: " + options.premiumBedType + "\n" + "Full Eat Included: " + options.fullEatIncluded + "\n" +
                "Air Conditioning Included: " + options.airConditioningIncluded + "\n" +
                "TV Included: " + options.tvIncluded ;
    }
    public void getDetails (){
        if(capacity >3){
            System.out.println("Premium room can`t be more than 3 rooms");
        }else {
            System.out.println(toString(new BookingOptions()));
        }
    }

    public void armorRoom(String guestName, int numberOfNights, BookingOptions options) {
        if (numberOfNights > 14) {
            System.out.println("You cannot book a Premium Room for more than 14 nights.");
        } else if (isAvailable()) {
            super.armorRoom(guestName, numberOfNights);
            System.out.println("Premium Room booked for " + guestName + " for " + numberOfNights + " nights.");
            System.out.println("Booking Options:\n" +
                    "Full Eat Included: " + options.fullEatIncluded + "\n" +
                    "Air Conditioning Included: " + options.airConditioningIncluded + "\n" +
                    "TV Included: " + options.tvIncluded);
            setAvailable(false);
        } else {
            System.out.println("This Premium Room already booked.");
        }
    }
    public void clearningRoomService(String request, double time) {
        super.clearningRoomService(request);
        System.out.println("Premium room clean in this time: " + time);

    }
}


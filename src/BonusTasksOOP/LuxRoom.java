package BonusTasksOOP;

public class LuxRoom extends HotelNumber {

    public LuxRoom(int price, int roomNumber, boolean isAvailable, int capacity) {
        super(price, roomNumber, isAvailable, capacity);

    }

    public String toString(BookingOptions  options) {
        return super.toString() + "\n" + "Full Eat Included: " + options.fullEatIncluded + "\n" +
                "Air Conditioning Included: " + options.airConditioningIncluded + "\n" +
                "TV Included: " + options.tvIncluded + "\n" +
                "Wifi Included: " + options.wifiIncluded+ "\n" +
                "Parking Included: " + options.parkingIncluded+ "\n" +
                "Premium Bed Included: " + options.premiumBedType;
    }

    public void getDetails() {
        System.out.println(toString(new BookingOptions()));
    }


    public void armorRoom(String guestName, int numberOfNights, BookingOptions options) {
        if (numberOfNights > 7) {
            System.out.println("You cannot book a Lux Room for more than 7 nights.");
        } else if (isAvailable()) {
            super.armorRoom(guestName, numberOfNights);
            System.out.println("Lux Room booked for " + guestName + " for " + numberOfNights + " nights.");
            System.out.println("Booking Options:\n" +
                    "Full Eat Included: " + options.fullEatIncluded + "\n" +
                    "Air Conditioning Included: " + options.airConditioningIncluded + "\n" +
                    "TV Included: " + options.tvIncluded + "\n" +
                    "Wifi Included: " + options.wifiIncluded+ "\n" +
                    "Parking Included: " + options.parkingIncluded+ "\n" +
                    "Premium Bed Included: " + options.premiumBedType);
            setAvailable(false);
        } else {
            System.out.println("This Lux Room already booked.");
        }
    }
    public void clearningRoomService(String request, double time, String notesWhatClean) {
        super.clearningRoomService(request);
        System.out.println("In this time: " + time + "\nNotes for cleaning: " + notesWhatClean);
    }


}

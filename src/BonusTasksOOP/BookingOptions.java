package BonusTasksOOP;

public class BookingOptions {
    protected boolean breakfastIncluded;
    protected boolean minibarIncluded;
    protected boolean premiumBedType;
    protected boolean diningArea;
    protected boolean lunchIncluded;
    protected boolean dinnerIncluded;
    protected boolean parkingIncluded;
    protected boolean wifiIncluded;
    protected boolean airConditioningIncluded;
    protected boolean tvIncluded;
    protected boolean fullEatIncluded;
    protected boolean extraMiniBed;
    protected boolean extraDoubleArmorSafe;
    protected boolean extraDishes;


    public BookingOptions() {
        this.breakfastIncluded = true;
        this.minibarIncluded = true;
        this.premiumBedType = true;
        this.diningArea = true;
        this.lunchIncluded = true;
        this.dinnerIncluded = true;
        this.parkingIncluded = true;
        this.wifiIncluded = true;
        this.airConditioningIncluded = true;
        this.tvIncluded = true;
        this.fullEatIncluded = true;
        this.extraMiniBed = true;
        this.extraDoubleArmorSafe = true;
        this.extraDishes = true;
    }

    public boolean isExtraMiniBed() {
        return extraMiniBed;

    }

    public void setExtraMiniBed(boolean extraMiniBed) {
        this.extraMiniBed = extraMiniBed;
        System.out.println("Extra Minibed: " + extraMiniBed);
    }

    public boolean isExtraDoubleArmorSafe() {
        return extraDoubleArmorSafe;
    }

    public void setExtraDoubleArmorSafe(boolean extraDoubleArmorSafe) {
        this.extraDoubleArmorSafe = extraDoubleArmorSafe;
        System.out.println("Extra Double Armor Safe: " + extraDoubleArmorSafe);
    }

    public boolean isExtraDishes() {
        return extraDishes;
    }

    public void setExtraDishes(boolean extraDishes) {
        this.extraDishes = extraDishes;
        System.out.println("Extra Dishes: " + extraDishes);
    }

    public boolean isMinibarIncluded() {
        return minibarIncluded;
    }

    public void setMinibarIncluded(boolean minibarIncluded) {
        this.minibarIncluded = minibarIncluded;
        System.out.println("Minibar Included: " + minibarIncluded);
    }

    public boolean isPremiumBedType() {
        return premiumBedType;
    }

    public void setPremiumBedType(boolean premiumBedType) {
        this.premiumBedType = premiumBedType;
        System.out.println("Premium Bed Type: " + premiumBedType);
    }

    public boolean isDiningArea() {
        return diningArea;
    }

    public void setDiningArea(boolean diningArea) {
        this.diningArea = diningArea;
        System.out.println("Dining Area: " + diningArea);
    }

    public boolean isTvIncluded() {
        return tvIncluded;
    }

    public void setTvIncluded(boolean tvIncluded) {
        System.out.println("TV Included: " + tvIncluded);
        this.tvIncluded = tvIncluded;
    }

    public boolean isFullEatIncluded() {
        return fullEatIncluded;
    }

    public void setFullEatIncluded(boolean fullEatIncluded) {
        System.out.println("Full Eat Included: " + fullEatIncluded);
        this.fullEatIncluded = fullEatIncluded;
    }

    public boolean isLunchIncluded() {
        return lunchIncluded;
    }

    public void setLunchIncluded(boolean lunchIncluded) {
        System.out.println("Lunch Included: " + lunchIncluded);
        this.lunchIncluded = lunchIncluded;
    }

    public boolean isDinnerIncluded() {
        return dinnerIncluded;
    }

    public void setDinnerIncluded(boolean dinnerIncluded) {
        System.out.println("Dinner Included: " + dinnerIncluded);
        this.dinnerIncluded = dinnerIncluded;
    }

    public boolean isBreakfastIncluded() {
        return breakfastIncluded;
    }

    public void setBreakfastIncluded(boolean breakfastIncluded) {
        System.out.println("Breakfast Included: " + breakfastIncluded);
        this.breakfastIncluded = breakfastIncluded;
    }

    public boolean isParkingIncluded() {
        return parkingIncluded;
    }

    public void setParkingIncluded(boolean parkingIncluded) {
        System.out.println("Parking Included: " + parkingIncluded);
        this.parkingIncluded = parkingIncluded;
    }

    public boolean isWifiIncluded() {
        return wifiIncluded;
    }

    public void setWifiIncluded(boolean wifiIncluded) {
        System.out.println("Wifi Included: " + wifiIncluded);
        this.wifiIncluded = wifiIncluded;
    }

    public boolean isAirConditioningIncluded() {
        return airConditioningIncluded;
    }

    public void setAirConditioningIncluded(boolean airConditioningIncluded) {
        System.out.println("Air Conditioning Included: " + airConditioningIncluded);
        this.airConditioningIncluded = airConditioningIncluded;
    }
}

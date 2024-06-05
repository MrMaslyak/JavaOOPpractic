package BonusTasksOOP;

public class Food  extends  Product{
    public Food(String name, double price, int count) {
        super(name, price, count);
    }
    public String getPricePrint() {
        return String.valueOf(super.getPricePrint());
    }

    public String getDescriptionPrint() {
        return super.getDescriptionPrint();
    }
}

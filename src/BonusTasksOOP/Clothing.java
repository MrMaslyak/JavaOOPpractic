package BonusTasksOOP;

public class Clothing  extends  Product{

    public Clothing(String name, double price, int count) {
        super(name, price, count);

    }
    public String getPricePrint() {
        return String.valueOf(super.getPricePrint());
    }

    public String getDescriptionPrint() {
        return super.getDescriptionPrint();
    }
}

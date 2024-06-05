package BonusTasksOOP;

public class Electronics extends Product {



    public Electronics(String name, double price, int count) {
        super(name, price, count);
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    public String getPricePrint() {
        return String.valueOf(super.getPricePrint());
    }

    public String getDescriptionPrint() {
        return super.getDescriptionPrint();
    }

}

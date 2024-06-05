package BonusTasksOOP;

public class Product {
    protected String name;
    protected double price;
    protected int count;
    protected int userCount;

    public Product(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
        this.userCount = 0;
    }

    public Product() {

    }

    public int getUserCount() {
        return userCount;
    }

    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPricePrint() {
        return "Price product: " + price;
    }

    public String getDescriptionPrint() {
        return "Name product: " + name;
    }

    public void displayDetails() {
        System.out.println("Name: " + getName() + " Price: " + getPrice());
    }


}

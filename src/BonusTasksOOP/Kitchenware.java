package BonusTasksOOP;

public class Kitchenware extends  Product{
    private int quantity;


    public Kitchenware(String name, double price,int quantity,int count ) {
        super(name, price, count);
        this.quantity = quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void displayDetails () {
        super.displayDetails();
        System.out.println( " Quantity: " + getQuantity());
    }
}

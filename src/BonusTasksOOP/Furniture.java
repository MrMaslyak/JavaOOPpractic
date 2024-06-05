package BonusTasksOOP;

public class Furniture extends Product{
    protected String material;

    public Furniture(String name, double price,int count, String material) {
        super(name, price, count);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void displayDetails () {
        super.displayDetails();
        System.out.println( " Material: " + getMaterial());
    }
}

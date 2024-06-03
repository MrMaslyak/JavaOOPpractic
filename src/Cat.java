public class Cat extends Animal {
    private String color;
    private String customInfo ;

    public Cat(String name, int age,  String color,String customInfo) {
        super(name, age);
        this.color = color;
        this.customInfo = customInfo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    public void setCustomInfo(String customInfo) {
        this.customInfo = customInfo;
    }
    public String toString(){
        return super.toString() + " Color: " + color + " Custom Info: " + customInfo;
    }
    public void getInfo(){
        System.out.println(toString());
    }
    public void customizeInfo(String customInfo){
        setCustomInfo(customInfo);
        System.out.println("Custom Info updated for Cat: " + getName() + " - " + customInfo);
    }

}

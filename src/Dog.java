public class Dog extends Animal {
    private String breed;
    private String customInfo ;
    public Dog(String name, int age,String breed, String customInfo) {
        super(name, age);
        this.breed = breed;
        this.customInfo = customInfo;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCustomInfo() {
        return customInfo;
    }

    public void setCustomInfo(String customInfo) {
        this.customInfo = customInfo;
    }
    public String toString(){
        return super.toString() + " Breed: " + breed + " Custom Info: " + customInfo;
    }
    public void getInfo(){
        System.out.println(toString());
    }

    public void customizeInfo(String customInfo) {
        setCustomInfo(customInfo);
        System.out.println("Custom Info updated for Dog: " + getName() + " - " + customInfo);
    }

}

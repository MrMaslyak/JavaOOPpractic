import java.util.ArrayList;
import java.util.Objects;

public class PetStore {
    ArrayList <Animal> animals  = new ArrayList<>();

    public PetStore() {
        this.animals = animals;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
        System.out.println("Added " + animal);
    }
    public void removeAnimal(String name){
        Animal toRemove = null;
        for (Animal animal : animals) {
            if (name.equals(animal.getName())) {
                toRemove = animal;
                break;
            }
        }
        if (toRemove != null) {
            animals.remove(toRemove);
            System.out.println("Removed " + toRemove);
        }
    }
    public void listAnimals(){
        System.out.println("--------------");
        System.out.println("List of animals: ");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
        System.out.println("--------------");
    }
    public void customizeAnimalInfo(String name, String customInfo){
        for (Animal animal : animals) {
            if (name.equals(animal.getName())){
                animal.customizeInfo(customInfo);
            }
        }
    }
}

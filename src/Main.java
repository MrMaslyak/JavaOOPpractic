public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new Manager("Ivan", 340, 2500, "IT"));
        company.addEmployee(new Manager("Igor", 380, 4000, "IT"));
        company.addEmployee(new Engineer("Stas", 270, 2500, "IT-Python"));
        company.addEmployee(new Engineer("Valeryi", 233, 5000, "IT-Java"));
        company.listEmployees();
        company.removeEmployee(270);
        company.listEmployees();
        System.out.println("*****************************************************************");
        PetStore petStore = new PetStore();
        petStore.addAnimal(new Dog("Sharik", 2, "hasky", "Friendly with kids"));
        petStore.addAnimal(new Cat("Murzik", 3, "meyn-kyn", "love eat"));
        petStore.listAnimals();
        petStore.customizeAnimalInfo("Sharik", "love sleep");
        petStore.removeAnimal("Murzik");
        petStore.listAnimals();
        System.out.println("*****************************************************************");
    }
}
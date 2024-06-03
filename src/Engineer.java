public class Engineer extends  Employee{
    private String specialty;

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Engineer(String name, int id, int salary,String specialty ) {
        super(name, id, salary);
        this.specialty = specialty;
    }
    public String toString() {
        return super.toString() + " Specialty: " + specialty + " ";
    }
    public void getDetails () {
        System.out.println(toString());
    }
}

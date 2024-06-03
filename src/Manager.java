public class Manager extends Employee {
private  String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public Manager(String name, int id, int salary , String department) {
        super(name, id, salary);
        this.department = department;
    }
    public String toString() {
        return super.toString() + " Department: " + department + " ";
    }
    public void getDetails(){
        System.out.println(toString());
    }
}

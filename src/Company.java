import java.util.ArrayList;

public class Company {
    ArrayList <Employee> employees = new ArrayList<>();

    public Company() {
        this.employees = employees;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
        System.out.println("We add this employee in company: " + employee );
    }
    public void removeEmployee(int id){
       for (Employee employee : employees) {
           if (employee.getId() == id){
               employees.remove(employee);
               System.out.println("We remove this employee in company: " + employee );
           }
       }
    }
    public void listEmployees(){
        System.out.println("--------------");
        System.out.println("List of employees in company: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("--------------");
    }
}

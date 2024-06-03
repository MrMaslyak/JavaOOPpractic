import java.util.ArrayList;

public class Company {
   private ArrayList <Employee> employees = new ArrayList<>();

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Company() {
        this.employees = employees;
    }
    public void addEmployee(Employee employee){
        employees.add(employee);
        System.out.println("We add this employee in company: " + employee );
    }
    public void removeEmployee(int id) {
        Employee toRemove = null;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                toRemove = employee;
                break;
            }
        }
        if (toRemove != null) {
            employees.remove(toRemove);
            System.out.println("We remove this employee in company: " + toRemove);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
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

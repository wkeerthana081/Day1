class Person{
    String name;
    public void displayPerson(){
        System.out.println("Name: " + name);
    }
}
class Employee extends Person{
    int EmployeeId;
    public void displayEmployee(){
        System.out.println("Employee ID: " + EmployeeId);
    }
}
class Manager extends Employee{
    String department;
    public void displayManager(){
        System.out.println("Department: " + department);
    }
}
public class Main3 {
    public static void main(String[] args){
        Person p = new Person();
        Employee e = new Employee();
        Manager m = new Manager();
        p.name = "John Doe";
        e.EmployeeId = 123;
        m.department = "Sales";
        p.displayPerson();
        e.displayEmployee();
        m.displayManager();
    }
}

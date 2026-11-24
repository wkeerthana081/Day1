class Employee {
    String name;
    double baseSalary;
    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}
class Developer extends Employee {
    String programmingLanguage;
    void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage);
    }
}
class Tester extends Employee {
    String testingTool;
    void runTests() {
        System.out.println(name + " is running tests using " + testingTool);
    }
}
class employ2 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.name = "Keerthana";
        d.baseSalary = 30000;
        d.programmingLanguage = "Java";
        Tester t = new Tester();
        t.name = "Swetha";
        t.baseSalary = 25000;
        t.testingTool = "xyz";
        d.displayBasicInfo();
        d.writeCode();
        t.displayBasicInfo();
        t.runTests();
    }
}
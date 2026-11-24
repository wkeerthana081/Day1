class Vehicle {
    String brand;
    public void honk(){
        System.out.println("Beep Beep");
    }
    public void setBrand(String b){
        brand = b;
    }
    
}
class Car extends Vehicle {
    String modelName;
    public void setModelName(String m){
        modelName = m;
    }
    public void displayDetails(){
        System.out.println(brand);
        System.out.println(modelName);
    }
}
public class Beep {
    public static void main(String[] args){
        Car c = new Car();
        c.setBrand("BMW");
        c.setModelName("X5");
        c.displayDetails();
    }
}

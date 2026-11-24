import java.math.*;
class Shape {
    String color;
    public void displayColor(){
        System.out.println(color);
    }
    public void setColor(String c){
        color = c;
    }
}
class Circle extends Shape {
    double radius;
    public double calculateArea(){
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape {
    double length;
    double width;
    public double calculateArea(){
        return length * width;
    }
}
public class task {
    public static void main(String[] args){
        Shape s = new Shape();
        Circle c= new Circle();
        c.color = "Red";
        c.radius = 5;
        System.out.println("Circle");
        System.out.println("Area: " + c.calculateArea());
        c.displayColor();
        Rectangle r = new Rectangle();
        r.color = "White";
        r.length = 10;
        r.width = 5;
        System.out.println("Rectangle");
        System.out.println("Area: " + r.calculateArea());
        r.displayColor();
    }
}

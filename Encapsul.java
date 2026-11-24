class Rectangle {
    private double length;
    private double width;

    public void setLength(double l) {
        if (l > 0)
            length = l;
        else
            System.out.println("Invalid length");
    }

    public void setWidth(double w) {
        if (w > 0)
            width = w;
        else
            System.out.println("Invalid width");
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
public class Encapsul {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.setLength(10);
        r.setWidth(5);

        System.out.println(r.getLength());
        System.out.println(r.getWidth());
        System.out.println(r.calculateArea());
        System.out.println(r.calculatePerimeter());
    }
}
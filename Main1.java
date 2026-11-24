class Car{
    private int speed=300;
    public void getter(){
        System.out.println("Speed: " + speed);
    }
    public void setter(int s){
        speed = s;
    }
}
public class Main1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.getter();
        car.setter(1000);
        car.getter();
    }
}

class Animal{
    String name;
    public void eat(){
        System.out.println(name  +  " is eating");
    }
}
class Dog extends Animal {
    String breed;
    public void bark(){
        System.out.println(name + " the " + breed + "is barking");
    }
}
public class hw1 {
    public static void main(String[] args){
        Dog d = new Dog();
        d.name = "Julie";
        d.breed = "Pomerian";
        d.eat();
        d.bark();
    }
}

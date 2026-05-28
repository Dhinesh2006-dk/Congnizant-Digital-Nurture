class Animal{
    void makeSound(){
        System.out.println("sound");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.makeSound();
    }
}

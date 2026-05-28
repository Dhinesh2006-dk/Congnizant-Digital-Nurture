
class Car{
    String make="Toyota";
    String model="Camry";
    int year=2024;
    void displayDetails(){
        System.out.println("Make : "+make);
        System.out.println("Model : "+model);
        System.out.println("Year : "+year);
    }
}
public class Classes {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.displayDetails();
    }
}

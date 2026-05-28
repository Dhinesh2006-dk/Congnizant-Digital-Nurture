import java.util.*;
import java.util.stream.Collectors;
record Person(String name, int age) {}
public class Record {
    public static void main(String[] args) {
        List<Person> people =
        new ArrayList<Person>();
        people.add(new Person("Ron", 18));
        people.add(new Person("Harry", 17));
        people.add(new Person("Hermione", 19));
        people.add(new Person("Draco", 16));
        System.out.println("All Persons:");
        for(Person p : people) {
            System.out.println(p);
        }
        List<Person> adults =
        people.stream()
              .filter(p -> p.age() >= 18)
              .collect(Collectors.toList());
        System.out.println("\nAge 18 and Above:");
        for(Person p : adults) {
            System.out.println(p);
        }
    }
}
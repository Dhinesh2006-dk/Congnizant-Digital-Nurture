import java.util.ArrayList;
import java.util.Collections;
public class LambdaExample {
    public static void main(String[] args) {
        ArrayList<String> names =
        new ArrayList<String>();
        names.add("Ron");
        names.add("Harry");
        names.add("Hermione");
        names.add("Draco");
        Collections.sort(names,(a,b) -> a.compareTo(b));
        System.out.println("Sorted List:");
        for(String s : names) {
            System.out.println(s);
        }
    }
}
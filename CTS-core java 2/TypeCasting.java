import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double salary=sc.nextDouble();
        System.out.println("Double -> Int : "+(int)salary);
        int height=sc.nextInt();
        System.out.println("Int -> Double : "+(double)height);
        sc.close();
    }
}

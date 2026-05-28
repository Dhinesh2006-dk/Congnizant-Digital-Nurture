import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The given number is Even");
        }
        else{
            System.out.println("The given number is Odd");
        }
        sc.close();
    }
}

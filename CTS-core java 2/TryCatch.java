import java.util.*;
public class TryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            int res=a/b;
            System.out.println("Result = "+res);
        }catch(ArithmeticException e){
            System.out.println("Cannot divided by zero");
        }
        sc.close();
    }

    
}

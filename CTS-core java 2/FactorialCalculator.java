import java.util.*;
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        if(n==0){
            System.out.println("The factorial for the given number is "+n+" : 1");
        }else{
            if(n>0){
            for(int i=n;i>1;i--){
                fact=fact*i;
            }
        }
        System.out.println("The factorial for the given number is "+n+" : "+fact);
    }
    sc.close();
}
}

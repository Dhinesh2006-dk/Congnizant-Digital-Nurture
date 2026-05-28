import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int n1=sc.nextInt();
        System.out.print("Enter number 2 : ");
        int n2=sc.nextInt();
        System.out.println("Choose Operation : ('+','-','*','/') ");
        char op=sc.next().charAt(0);
        if(op=='+'){
            System.out.println("Result = " + (n1+n2));
        }
        else if(op=='-'){
            System.out.println("Result = " + (n1-n2));
        }
        else if(op=='*'){
            System.out.println("Result = " + (n1*n2));
        }
        else if(op=='/'){
            if(n2!=0){
                System.out.println("Result = " + (n1/n2));
            }
        }
        sc.close();
    }
}

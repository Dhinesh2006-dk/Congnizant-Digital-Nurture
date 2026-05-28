import java.util.*;
public class Arraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        float d=(float)sum/n;
        System.out.println("Sum of Array = "+sum);
        System.out.println("Average of Array = "+d);
        sc.close();
    }
}

import java.util.*;
public class Palindrome {
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]", "");
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
           rev+=s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        sc.close();
    }
}

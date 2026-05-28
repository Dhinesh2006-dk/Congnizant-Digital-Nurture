import java.util.*;
public class GuessGame {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int target=rand.nextInt(100)+1;
        // System.out.println(target);
    int guess=0;
    while(guess != target){
        System.out.println("Guess the Number from 1 to 100 : ");
        guess=sc.nextInt();
        if(guess>target){
            System.out.println("Too High");
        }else if(guess<target){
            System.out.println("Too Low");
        }else{
            System.out.println("Correct Number");
        }
    }
    sc.close();
   }
}
  

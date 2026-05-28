import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> student=new ArrayList<String>();
        System.out.println("Enter the number of students : ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the student name : ");
        for(int i=0;i<n;i++){
            String name=sc.nextLine();
            student.add(name);
        }
        System.out.println();
        System.out.println("Student name :");
        for(String s:student){
            System.out.println(s);
        }
        sc.close();

    }
}

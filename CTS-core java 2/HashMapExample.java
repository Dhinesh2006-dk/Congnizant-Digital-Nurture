import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> student = new HashMap<Integer,String>();
        System.out.print("Enter the number of student = ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("Enter the student ID = ");
            int id=sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the student name : ");
            String name=sc.nextLine();
            student.put(id, name);
        }
        System.out.print("Search student using ID = ");
        int searchID=sc.nextInt();
        if(student.containsKey(searchID)){
            System.out.print("Student Name : "+ student.get(searchID));
        }else{
            System.out.println("ID not found");
        }
        sc.close();
    }
}


public class OperatorPrecedence {
    public static void main(String[] args) {
        int res1=10 + 5 * 2;
        System.out.println("Expression =  10 + 5 * 2");
        System.out.println("Step-1 = 5 * 2 = 10");
        System.out.println("Step-2 = 10 + 10 = 20");
        System.out.println("Output : "+res1);
        System.out.println();
        int res2 = (10 + 5) * 2;
        System.out.println("Expression : (10 + 5) * 2");
        System.out.println("Step-1 : 10 + 5 = 15");
        System.out.println("Step-2 : 15 * 2 = 30");
        System.out.println("Output = " +res2);
        System.out.println();
    }
}

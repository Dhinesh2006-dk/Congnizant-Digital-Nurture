class A{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        A obj = new A();
        obj.add(12,44);
        obj.add(13, 14, 15);
        obj.add(23.4555, 44.8979);
    }
}

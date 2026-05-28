public class PatternMatching {
    public static void checkType(Object obj) {
        switch(obj) {
            case Integer n ->
                System.out.println(
                "Integer value: " + n);
            case String s ->
                System.out.println(
                "String value: " + s);
            case Double d ->
                System.out.println(
                "Double value: " + d);
            default ->
                System.out.println(
                "Unknown Type");
        }
    }
    public static void main(String[] args) {
        checkType(100);
        checkType("Ron");
        checkType(99.5);
        checkType(true);
    }
}
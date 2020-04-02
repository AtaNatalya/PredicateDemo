import java.util.function.Predicate;

public class DemoJavaPredicate {
    public static void main(String[] args) {

        ExampleFunctionalInterface e = a -> a < 0;

        Predicate<Integer> negative = i -> i < 0;

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Example functional interface: " + e.isNegative(2));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Example Predicate -> test: " + negative.test(2));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Example Predicate -> negate: " + negative.negate().test(6));


        //ANDing and ORing example
        Predicate<String> containsA = t -> t.contains("A");
        Predicate<String> containsB = t -> t.contains("Y");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Example Predicate -> AND: " +containsA.and(containsB).test("ABCD"));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Example Predicate -> OR: " +containsA.or(containsB).test("ABCD"));
        System.out.println("---------------------------------------------------------------------");

    }
}

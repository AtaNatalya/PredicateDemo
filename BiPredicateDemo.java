import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {

        //Predicate for checking equality
        BiPredicate<Integer, String> biPredicate = (i, s) -> {

            if(i == Integer.parseInt(s))
                return true;
            return false;
        };

        // Predicate for checking greater than
        BiPredicate<Integer, String> biPredicate1 = (n, s) ->
        {
            if (n > Integer.parseInt(s))
                return true;
            return false;
        };

        System.out.println("---------------------------------------------------------------------");
        System.out.println("BiPredicate example: test -> " + biPredicate.test(3, "3"));

        // ANDing the two predicates
        BiPredicate<Integer, String> biPredicate2 = biPredicate.and(biPredicate1);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("BiPredicate example: AND -> " + biPredicate2.test(2, "3"));

        // ORing the two predicates
        biPredicate2 = biPredicate.or(biPredicate1);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("BiPredicate example: OR -> " + biPredicate2.test(3, "2"));

        // Negating the predicate
        biPredicate2 = biPredicate.negate();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("BiPredicate example: negate -> " + biPredicate2.test(3, "2"));
        System.out.println("---------------------------------------------------------------------");
    }

}


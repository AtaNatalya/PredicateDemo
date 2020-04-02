@FunctionalInterface
public interface ExampleFunctionalInterface {

    boolean equals(Object o);

    int hashCode();

    String toString();

    default String getValue(){return "test";}

    boolean isNegative(int a);

    //void abstractMethod();
}



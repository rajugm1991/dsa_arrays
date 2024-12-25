package java8;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {

    public static void main(String[] args) {


        //consumer
        Consumer<String> consumer= System.out::println;
        consumer.accept("Consumer interface");

        //Predictor

        Predicate<Integer> even=(t)-> t%2==0;
        System.out.println(even.test(10));

        // Supplier

        Supplier<String> tes=()->"Supplier test";
        System.out.println(tes.get());

    }
}

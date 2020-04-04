package org.example.scratch;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Kappa {

    public static void doFoo(Zeta zeta) {
        zeta.singleMethod("Patrick");
    }

    public static void doBar(Function<String, Integer> function, String number) {
        Integer converted = function.apply(number);
        System.out.println(converted);

    }

    public static void main(String[] args) {

        // An instance of a functional interface is declared with its parameterized behaviour.
        Zeta zeta = (String s) -> System.out.println("hello " + s);
        Kappa.doFoo(zeta);

        Function<String, Integer> function = Integer::parseInt;
        Function<String, Integer> functionEquivalent = (String s) -> Integer.parseInt(s);
        Kappa.doBar(function, "1");


        Consumer<String> consumer = (String s) -> {
            if (s.length() > 5) {
                System.out.println(s + " was greater than 5 characters");
            }
        };

        List<String> list = Arrays.asList("Tommy", "Jason", "Lucinda", "");
        list.forEach(consumer);

        Kappa kappa = new Kappa();
        Minos minos = kappa.new Minos();
        minos.test();

    }

    class Minos implements Gamma {
        public void test() {
            System.out.println("This is from an inner class.");
            doGammaRays();
        }
    }
}

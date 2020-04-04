package org.example.scratch;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class Delta {

    public static void main(String[] args) {
        Runnable runnable = System.out::println;
        runnable.run();

        Alpha alpha = String::isEmpty;

        System.out.println(alpha.nameIt("Position"));

        Beta<Foo> bar = Foo::new;

        Foo foo = bar.create("Patrick",38,true);
        foo.getLocalAge(100);

        Predicate<Foo> predicate = Foo::isDrivingLicenceOwner;
        System.out.println(predicate.test(new Foo()));


        List<String> strings = Arrays.asList("1","2","3","4","");

        Consumer<String> consumer = s -> System.out.println(s.isEmpty());

        strings.forEach(s -> consumer.accept(s));

        strings.forEach(c -> System.out.println(c));


        Function<String,Integer> intParser=Integer::parseInt;

        List<Integer> intList=Arrays.asList(1,2,3,4);

        String hello = "hello";

        Function<String, String> function = String::valueOf;
        System.out.println(function.apply("ee"));






    }
}

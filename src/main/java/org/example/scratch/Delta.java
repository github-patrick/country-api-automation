package org.example.scratch;


import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;
import java.util.function.*;

public class Delta {

    public static void main(String[] args) {
        Runnable runnable = System.out::println;
        runnable.run();

        Alpha<Boolean> alpha = String::isEmpty;


        System.out.println(alpha.nameIt("Position"));

        Beta<Foo> bar = Foo::new;

        Foo foo = bar.create("Patrick",38,true);
        foo.getLocalAge(100);

        Predicate<Foo> predicate = Foo::isDrivingLicenceOwner;
        System.out.println(predicate.test(new Foo()));


        List<String> strings = Arrays.asList("1","2","3","4","");

        Consumer<String> consumer = s -> System.out.println(s.isEmpty());

        strings.forEach(consumer::accept);
        strings.forEach(System.out::println);

        Function<String,Integer> intParser=Integer::parseInt;

        Function<String, String> function = String::valueOf;
        System.out.println(function.apply("ee"));

        OptionalInt intVal = OptionalInt.of(2);

        int val = intVal.orElse(new Integer(99));
        System.out.println(val);







    }
}

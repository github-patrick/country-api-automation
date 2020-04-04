package org.example.scratch;

import java.util.HashSet;
import java.util.Set;

public interface Gamma {

    default void doGammaRays() {
        Set<Integer> set = new HashSet();
        set.add(2);
        set.add(3);
        set.add(3);

        set.forEach(System.out::println);
    }
}

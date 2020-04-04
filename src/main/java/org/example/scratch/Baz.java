package org.example.scratch;

@FunctionalInterface
public interface Baz {
    void move();

    default String printIt() {
        System.out.println("I have printed from the default method");
        return "HTTP OK";
    }

}

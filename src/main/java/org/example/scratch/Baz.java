package org.example.scratch;

public interface Baz {
    void move();

    default String printIt() {
        System.out.println("I have printed from the default method");
        return "HTTP OK";
    }

}

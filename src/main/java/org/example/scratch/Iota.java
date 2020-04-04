package org.example.scratch;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Iota {

    // encapsulation of the internal state of the class
    // private access modifier which is accessible to its enclosing class
    private String state;
    private String stateTwo;

    // public method to access state information.
    // public access modifier which is open to the world.
    public String getState() {
        return state;
    }

    class Deep implements Runnable {

        @Override
        public void run() {
            System.out.println("Doing something in the inner class.");
        }
    }

    static class Hello {
        private int [] ages = new int[3];
        public void calculateTotalAges() throws UnsupportedEncodingException {
            ages[0] = 45;
            ages[1] = 34;
            ages[2] = 33;
            int totalAge = 0;
            for (int a : ages) {
                totalAge+=a;
            }


           Integer integer = Arrays.stream(ages).filter((s) -> s > 20).findFirst().orElse(45);

            String encoded = Base64.getEncoder().encodeToString("tester:password".getBytes());
            String urlEncoded = Base64.getUrlEncoder().encodeToString("https://google.com?q=this&that".getBytes("utf-8"));
            System.out.println("Base 64: " + encoded);
            System.out.println("Base 64 url: " + urlEncoded);



            System.out.println("The average age: " + totalAge/ages.length);
        }
    }

    public static void main(String[] args) throws Exception {

        Iota iota = new Iota();
        Deep deep = iota.new Deep();

        Thread thread = new Thread(deep);
        thread.start();

        System.out.println(thread.getState());

        Runnable runnable = () -> System.out.println("Doing something in this thread");
        runnable.run();
        System.out.println(thread.getState());

        Hello hello = new Iota.Hello();
        hello.calculateTotalAges();

    }
}

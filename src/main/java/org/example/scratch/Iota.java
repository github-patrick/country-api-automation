package org.example.scratch;


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
        public void calculateTotalAges() {
            ages[0] = 45;
            ages[1] = 34;
            ages[2] = 19;
            int totalAge = 0;
            for (int a : ages) {
                totalAge+=a;
            }
            System.out.println("The average age: " + totalAge/ages.length);
        }


    }

    public static void main(String[] args) {

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

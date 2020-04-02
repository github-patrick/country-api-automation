package org.example.scratch;

// By extending Foo and implementing Baz this class type can have behaviour from both the superclass and the interface.
public class Bar extends Foo implements Baz {

    public Bar(String name, int age, boolean drivingLicenceOwner, Environment environment) {
        super(name, age, drivingLicenceOwner);
        this.environment = environment;
    }

    public Bar() {}

    private Environment environment;

    public void determineValidity() {
        environment = Environment.PRE_PROD;
    }

    @Override
    public void move() {
        System.out.println("I am moving");
    }

    @Override
    public int getLocalAge(int localAge) {
        System.out.println("From the parent class :" + super.getLocalAge(localAge));
        return 200 + localAge;
    }

    public static void main(String[] args) {

        Foo bar2 = new Bar();
        Foo bar = new Bar();
        System.out.println(bar2.getLocalAge(3));
        System.out.println(bar2.hashCode());
        System.out.println(bar.hashCode());
        System.out.println(bar.equals(bar2));

    }

}

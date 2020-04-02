package org.example.scratch;

public class Foo {

    // Access modifier private used to encapsulate the objects state.
    private static int planetCount;
    boolean drivingLicenceOwner;
    protected String referenceId;
    private String name;
    private int age;
    private static final String SURNAME = "Ford";

    public Foo() {}

    // Constructor
    public Foo(String name, int age, boolean drivingLicenceOwner) {
        this.name = name;
        this.age = age;
        this.drivingLicenceOwner = drivingLicenceOwner;
    }

    public String printName(String name) {
        return name;
    }

    // Method overloading same method name but the method signature is unique.
    public String printName(String name, int position) {
        int total = position;
        return name;
    }

    // LocalAge is a parameter in the methods parenthesises.
    public int getLocalAge(int localAge) {
        return 102 + localAge;
    }

    public static String printSurname() {
        return SURNAME;
    }

    private void shouldNotBeInherited() {}
    public final void shouldNotBeOverridden(String name) {}


    public static void main(String[] args) {
        int pid = 348384;
        Foo foo = new Foo();
        foo.getLocalAge(3);

        Foo.printSurname();
    }
}

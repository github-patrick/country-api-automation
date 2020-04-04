package org.example.scratch;

@FunctionalInterface
public interface Alpha<T> {
    T nameIt(String name);
}


@FunctionalInterface
interface Beta<T extends Foo> {
    T create(String name, int age, boolean drivingLicence);
}

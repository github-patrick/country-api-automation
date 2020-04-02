package org.example.scratch;


import java.util.Arrays;
import java.util.List;

public class Scratch<T>  {

    private T t;

    public Scratch(T t) {
        this.t = t;
    }

    public<U> U makeGold(U u, List<?> list) {
        list.size();
        return u;
    }

    // extends bound indicates that the type needs to be a subtype of that type or of that type.
    // super bound indicates that it has to be the type or a super type of that type.
    public static <U extends Integer> void addNumbers(List<? super Number> list, U var) {
        list.add(var);
        System.out.println(list.size());
    }


    public static void main(String[] args) {
        Scratch<Number> scratch = new Scratch(new Bar());
        System.out.println(scratch.makeGold(3, Arrays.asList(1,2)));
        Scratch.addNumbers(Arrays.asList(1,2), 3);
    }
}

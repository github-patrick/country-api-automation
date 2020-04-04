package org.example.scratch;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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

    public void doInterestRateCalculation() throws FileNotFoundException {
        FileReader fileReader = new FileReader("hello");
    }



    public static void main(String[] args) throws Exception {
        Scratch<Number> scratch = new Scratch(new Bar());
        System.out.println(scratch.makeGold(3, Arrays.asList(1,2)));

        Map<String, String> map = System.getenv();
        for (String envName : map.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    map.get(envName));
        }

        System.out.println(System.getProperty("java.class.path"));
    }
}

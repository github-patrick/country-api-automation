package org.example.domain;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamer {

    public static List<Integer> list = Arrays.asList(33,33,38,21,26,44,31);
    private static Logger log = LoggerFactory.getLogger(Streamer.class);


    public static Stream<String> getStream() {
        return Stream.of("Peter","Paul","Mark","Luke","John", "Abraham");
    }

    public static void incrementByOneHundred(int i) {
        int val = i + 100;
    }

    public static void main(String[] args) throws Exception {


        Streamer.getStream().
                filter((s)-> s.length() < 5).
                forEach(System.out::println);

        Double avg = Streamer.list.stream()
                .mapToInt(Integer::intValue)
                .average().orElseThrow(Exception::new);

        log.info(avg.toString());

    }
}

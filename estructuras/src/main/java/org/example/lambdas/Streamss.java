package org.example.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamss {

    public static void main(String[] args) {

        List<String> coches = new ArrayList<>(Arrays.asList("Ford", "Audi", "Skoda", "BMW", "Mitshubisi"));
//        FOMA 1
//        List<String> filtrados = coches.stream()
//                .filter(marca -> marca.endsWith("i"))
//                .filter(marca -> marca.length() > 3)
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        filtrados.forEach(System.out::println);

//        FORMA2
//        coches.stream()
//                .filter(marca -> marca.endsWith("i"))
//                .filter(marca -> marca.length() > 3)
//                .map(String::toUpperCase)
//                .forEach(System.out::println);


        Stream<String> stream = Stream.of("Ford", "BMW");

    }

}

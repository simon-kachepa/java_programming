package com.kachepasimon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@SpringBootApplication
public class FunctionalProgrammingApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(FunctionalProgrammingApplication.class, args);
    }

    @Override
    public void run(String... args){

        System.out.println("========= FUNCTIONAL PROGRAMMING =============");

        // Function<T,R> ==> R apply(T t)
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        Function<String, Integer> strLength = String::length;
        System.out.println(strLength.apply("Hello"));

        Function<String, String> strTrim = String::trim;
        System.out.println(strTrim.apply("        Hello an ma Dhafela    "));


        //Predicate<T> ==> Takes one input of type T and returns a boolean
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(6));

        //Consumer<T> ==> accepts a single input argument and returns no result
        Consumer<String> name = n -> System.out.println("Hello " + n);
        name.accept("Simon Kachepa");

        //Supplier<T> ==> Represents a supplier of results.
        Supplier<Integer> result = () -> 100;
        System.out.println(result.get());

        Supplier<String> stringSupplier = () -> "Hello from Supplier!";
        System.out.println(stringSupplier.get());

    }

}

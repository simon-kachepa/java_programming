package com.kachepasimon;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class StreamsLearningApplication implements CommandLineRunner {

    static void main(String[] args) {
        SpringApplication.run(StreamsLearningApplication.class, args);
    }

    @Override
    public void run(String... args) {
        List<Car> cars = MockData.getCars();

        // Practice Stream:

        System.out.println("=== Cars newer than 2020 ===");
    }
}

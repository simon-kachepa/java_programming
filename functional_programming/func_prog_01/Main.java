package func_prog_01;

import java.util.List;

import static func_prog_01.Main.Gender.*;

public class Main{

    public static void main(String[] args) {

        List<Person> people = List.of(
            new Person("Tino", MALE),
            new Person("Noku", FEMALE),
            new Person("Annie", FEMALE),
            new Person("John", MALE),
            new Person("Gire", FEMALE)
        );

        System.out.println("//Imperative Approach");

        for(Person person : people){
            if (FEMALE.equals(person.gender)){
                System.out.println(person);
            }
        }

        System.out.println("//Declarative Approach");
        people.stream().filter(person -> FEMALE.equals(person.gender)).forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString(){
            return "Person{" + 
                    "name = '" + this.name + '\'' +
                    ", gender = " + this.gender +
                    '}'; 
        }
    }

    public enum Gender{
        MALE, FEMALE
    }
}

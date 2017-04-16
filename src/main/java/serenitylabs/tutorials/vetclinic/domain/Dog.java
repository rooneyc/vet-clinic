package serenitylabs.tutorials.vetclinic.domain;

import com.google.common.base.Joiner;

import java.util.Arrays;
import java.util.List;

public class Dog {
    private final String name;
    private final String breed;
    private final List<String> colours;

    public Dog(String name, String breed, List<String> colour) {

        this.name = name;
        this.breed = breed;
        this.colours = colour;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public List<String> getColours() {
        return colours;
    }

    @Override
    public String toString() {

//        Using apache.commons.lang3
//        return name + " the " + (StringUtils.join(colours, ',') + " " + breed).toLowerCase();

//        Using Java 8
//        return name + " the " + (String.join(",", colours) + " " + breed).toLowerCase();

//        Using Guava
        return name + " the " + (Joiner.on("," ).join(colours) + " " + breed).toLowerCase();

    }

    public static DogBuilder called(String name) {
        return new DogBuilder(name);
    }

    public static class DogBuilder {
        private final String name;
        private String breed;

        public DogBuilder(String name) {
            this.name = name;
        }

        public DogBuilder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public Dog andOfColour(String... colour) {
            //return new Dog(name, breed, ImmutableList.copyOf(colour));
            return new Dog(name, breed, Arrays.asList(colour));

        }
    }
}

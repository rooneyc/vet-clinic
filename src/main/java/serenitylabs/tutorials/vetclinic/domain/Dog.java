package serenitylabs.tutorials.vetclinic.domain;

public class Dog {

    private final String name;
    private final String breed;
    private final String colour;

    public Dog(String name, String breed, String colour) {

        this.name = name;
        this.breed = breed;
        this.colour = colour;
    }

    String getName() {
        return name;
    }

    String getBreed() {
        return breed;
    }

    String getColour() {
        return colour;
    }

    static DogBreeder called(String name) {
        return new DogBreeder(name);
    }

    public static class DogBreeder {

        private String name;
        private String breed;

        public DogBreeder(String name) {
            this.name = name;
        }

        DogBreeder ofBreed(String breed) {
            this.breed = breed;
            return this;
        }

        Dog andOfColour(String colour) {
            return new Dog(name, breed, colour);
        }
    }
}

package serenitylabs.tutorials.vetclinic.domain;

public class Dog {

    private String name;
    private String breed;

    public Dog() {
    }

    public Dog(String name, String breed) {

        this.name = name;
        this.breed = breed;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    String getBreed() {
        return breed;
    }
}

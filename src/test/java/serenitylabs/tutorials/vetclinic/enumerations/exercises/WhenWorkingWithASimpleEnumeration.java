package serenitylabs.tutorials.vetclinic.enumerations.exercises;

import com.google.common.collect.ImmutableList;
import org.junit.Test;
import serenitylabs.tutorials.vetclinic.Breed;
import serenitylabs.tutorials.vetclinic.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class WhenWorkingWithASimpleEnumeration {

    @Test
    public void finding_dogs() {
        List<Pet> pets = ImmutableList.of(
                Pet.cat().named("Felix"),
                Pet.dog().named("Rover"),
                Pet.dog().named("Lassie"),
                Pet.rabbit().named("Fiver")
                );

        // TODO: Extract all the dogs from the pets list

        List<Pet> dogs = new ArrayList<>();
        for (Pet pet: pets) {
            if (Breed.Dog.equals(pet.getBreed())) {
                dogs.add(pet);
            }
        }

        assertThat(dogs, containsInAnyOrder( Pet.dog().named("Rover"), Pet.dog().named("Lassie")));

    }

    @Test
    public void list_all_known_breeds() {

        List<String> breeds = new ArrayList<>();
        for (Breed breed: Breed.values()) {
            breeds.add(breed.name());
        }
        assertThat(breeds, contains("Cat", "Dog", "Rabbit", "Fish", "Parrot"));

    }


}

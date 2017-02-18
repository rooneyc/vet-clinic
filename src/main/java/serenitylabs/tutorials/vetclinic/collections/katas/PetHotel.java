package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;

/**
 * Created by 83018 on 18/02/2017.
 */
public class PetHotel {

    //Make this work by refactoring the pet list field to use a TreeMap with a Java 8 comparator.
    //Why? The map keys are sorted naturally anyway...
    //https://praveer09.github.io/technology/2016/06/21/writing-comparators-the-java8-way/
    Comparator<Pet> comparator = comparing(Pet::getName, naturalOrder());
    //But to create TreeMap with keys that are strings from a Comparator I need a Comparator<String>
    //private Map<String, Pet> pets = new TreeMap<String, Pet>(comparing(Pet::getName, naturalOrder()));
    //Would work if was sorting a Tree Set of Pets....
    private Collection<Pet> pets = new TreeSet<Pet>(comparing(Pet::getName, naturalOrder()));

    public Collection<Pet> getPets() {
        return pets;
    }

    public BookingResponse checkIn(Pet pet) {
        pets.add(pet);
        return new BookingResponse(pet);
    }
}

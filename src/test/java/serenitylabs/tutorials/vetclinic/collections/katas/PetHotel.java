package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.ArrayList;
import java.util.Collection;

class PetHotel {

    private Collection<Pet> pets = new ArrayList<>();

    Collection<Pet> getPets() {
        return pets;
    }

    void checkIn(Pet pet) {
        pets.add(pet);
    }

}

package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

class PetHotel {

    private Map<String, Pet> pets = new TreeMap<>();

    Collection<Pet> getPets() {
        return pets.values();
    }

    void checkIn(Pet pet) {
        pets.put(pet.getName(), pet);
    }
}

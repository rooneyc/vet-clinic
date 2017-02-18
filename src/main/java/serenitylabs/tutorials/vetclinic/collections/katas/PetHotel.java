package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by 83018 on 18/02/2017.
 */
public class PetHotel {

    Map pets = new TreeMap<String, Pet>();

    public Collection<Pet> getPets() {
        return pets.values();
    }

    public void checkIn(Pet pet) {
        pets.put(pet.getName(), pet);
    }
}

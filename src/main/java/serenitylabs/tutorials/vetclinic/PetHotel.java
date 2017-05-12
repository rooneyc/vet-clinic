package serenitylabs.tutorials.vetclinic;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class PetHotel {

    private Map<String, Pet> pets = new TreeMap<>();

    public Collection<Pet> getPets() {
        return pets.values();
    }

    public void checkIn(Pet pet) {
        pets.put(pet.getName(), pet);
    }
}

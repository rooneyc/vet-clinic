package serenitylabs.tutorials.vetclinic;

import java.util.ArrayList;
import java.util.Collection;

public class PetHotel {

    private Collection<Pet> pets = new ArrayList<>();

    public Collection<Pet> getPets() {
        return pets;
    }

    public void checkIn(Pet pet) {
        pets.add(pet);
    }
}

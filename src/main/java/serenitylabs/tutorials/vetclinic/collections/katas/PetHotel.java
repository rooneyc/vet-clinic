package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 83018 on 18/02/2017.
 */
public class PetHotel {

    ArrayList pets = new ArrayList<Pet>();

    public Collection<Pet> getPets() {
        return pets;
    }

    public void checkIn(Pet pet) {
        pets.add(pet);
    }
}

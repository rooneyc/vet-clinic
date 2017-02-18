package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by 83018 on 17/02/2017.
 */
public class PetHotel {

    Map<String, Pet> pets = new TreeMap<>();

    public Map<String, Pet> getPets() {
        return pets;
    }

    public BookingResponse checkIn(String name, Pet pet) {
        pets.put(name, pet);
        return new BookingResponse(pet);
    }

}

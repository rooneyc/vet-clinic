package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;
import serenitylabs.tutorials.vetclinic.collections.katas.BookingResponse;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class PetHotel {

    private Map<String, Pet> pets = new TreeMap<>();

    public Collection<Pet> getPets() {
        return pets.values();
    }

    public BookingResponse checkIn(Pet pet) {
        pets.put(pet.getName(), pet);
        return new BookingResponse(pet);
    }
}

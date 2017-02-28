package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.Collection;
import java.util.TreeSet;

import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;

class PetHotel {

    private Collection<Pet> pets = new TreeSet<>(comparing(Pet::getName, naturalOrder()));

    static final int MAX_CAPACITY = 20;

    Collection<Pet> getPets() {
        return pets;
    }

    BookingResponse checkIn(Pet pet) {
        if (pets.size() < MAX_CAPACITY) {
            pets.add(pet);
        }
        return new BookingResponse(pet);
    }

}

package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;

class PetHotel {

    static final int MAXIMUM_CAPACITY = 20;

    private Set<Pet> pets = new TreeSet<>(comparing(Pet::getName, naturalOrder()));

    Collection<Pet> getPets() {
        return pets;
    }

    BookingResponse checkIn(Pet pet) {
        if (pets.size() != MAXIMUM_CAPACITY) {
            pets.add(pet);
            return new BookingResponse(pet);
        }
        return new BookingAcknowledgement(pet);
    }
}

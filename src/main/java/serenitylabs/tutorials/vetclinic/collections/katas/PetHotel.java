package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;

class PetHotel {

    private Set<Pet> pets = new TreeSet<>(comparing(Pet::getName, naturalOrder()));

    Collection<Pet> getPets() {
        return pets;
    }

    BookingResponse checkIn(Pet pet) {
        pets.add(pet);
        return new BookingResponse(pet);
    }
}

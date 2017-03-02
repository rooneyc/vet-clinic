package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;

class PetHotel {

    private final Collection<Pet> pets = new TreeSet<>(comparing(Pet::getName, naturalOrder()));

    private final Queue<Pet> waitingList = new LinkedList<>();

    static final int MAX_CAPACITY = 20;

    Collection<Pet> getPets() {
        return pets;
    }

    BookingResponse checkIn(Pet pet) {
        if (pets.size() < MAX_CAPACITY) {
            pets.add(pet);
            return new BookingConfirmation(pet);
        }
        return new BookingAcknowledgement(pet);
    }

    Queue<Pet> getWaitingList() {
        return waitingList;
    }
}

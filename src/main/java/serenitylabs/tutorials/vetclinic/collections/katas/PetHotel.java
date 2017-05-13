package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.Comparator.naturalOrder;

class PetHotel {

    static final int MAXIMUM_CAPACITY = 20;

    private Set<Pet> pets = new TreeSet<>(comparing(Pet::getName, naturalOrder()));
    private Queue<Pet> waitingList = new LinkedList<>();

    Collection<Pet> getPets() {
        return pets;
    }

    BookingResponse checkIn(Pet pet) {
        if (pets.size() != MAXIMUM_CAPACITY) {
            pets.add(pet);
            return new BookingResponse(pet);
        }
        waitingList.add(pet);
        return new BookingAcknowledgement(pet);
    }

    public Queue<Pet> getWaitingList() {
        return waitingList;
    }
}

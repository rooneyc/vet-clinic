package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

class BookingAcknowledgement extends BookingResponse {

    BookingAcknowledgement(Pet pet) {
        super(pet);
    }

    boolean isConfirmed() {
        return false;
    }

    boolean isOnWaitingList() {
        return true;
    }

}

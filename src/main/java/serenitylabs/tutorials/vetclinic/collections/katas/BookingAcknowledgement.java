package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

class BookingAcknowledgement extends BookingResponse {

    BookingAcknowledgement(Pet pet) {
        super(pet);
    }

    @Override
    boolean isConfirmed() {
        return false;
    }

    @Override
    boolean isOnWaitingList() {
        return true;
    }

}

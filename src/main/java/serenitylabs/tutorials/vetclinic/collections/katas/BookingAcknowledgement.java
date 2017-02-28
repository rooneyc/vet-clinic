package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

class BookingAcknowledgement extends BookingResponse {

    BookingAcknowledgement(Pet pet) {
        super(pet);
    }

    @Override
    public boolean isConfirmed() {
        return false;
    }

    @Override
    public boolean isOnWaitingList() {
        return true;
    }
}

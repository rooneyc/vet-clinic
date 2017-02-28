package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

class BookingConfirmation extends BookingResponse {

    BookingConfirmation(Pet pet) {
        super(pet);
    }

    @Override
    public boolean isConfirmed() {
        return true;
    }

    @Override
    public boolean isOnWaitingList() {
        return true;
    }
}

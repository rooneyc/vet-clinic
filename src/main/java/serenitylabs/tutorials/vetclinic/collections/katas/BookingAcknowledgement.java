package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

class BookingAcknowledgement extends BookingResponse {

    public BookingAcknowledgement(Pet pet) {
        super(pet);
    }

    boolean isConfirmed() {
        return false;
    }

}

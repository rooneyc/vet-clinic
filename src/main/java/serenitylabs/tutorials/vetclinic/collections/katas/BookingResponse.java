package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

class BookingResponse {

    private Pet pet;

    BookingResponse(Pet pet) {
        this.pet = pet;
    }

    Pet pet() {
        return pet;
    }

    int bookingNumber() {
        return 0;
    }

    boolean isConfirmed() {
        return true;
    }

    boolean isOnWaitingList() {
        return true;
    }
}

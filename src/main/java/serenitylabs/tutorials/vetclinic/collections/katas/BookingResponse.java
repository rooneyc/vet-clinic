package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

public class BookingResponse {

    private Pet pet;

    private int bookingNumber;

    BookingResponse(Pet pet) {
        this.pet = pet;
    }

    boolean isConfirmed() {
        return true;
    }

    Pet getPet() {
        return pet;
    }

    int getBookingNumber() {
        return bookingNumber;
    }

    boolean isOnWaitingList() {
        return true;
    }
}

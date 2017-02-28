package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

abstract class BookingResponse implements BookingReply {

    private final Pet pet;

    private int bookingNumber;

    BookingResponse(Pet pet) {
        this.pet = pet;
    }

    Pet getPet() {
        return pet;
    }

    int getBookingNumber() {
        return bookingNumber;
    }

}

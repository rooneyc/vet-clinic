package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

public class BookingResponse {

    private Pet pet;
    private int bookingNumber = 0;

    BookingResponse(Pet pet) {
        this.pet = pet;
    }

    boolean isConfirmed() {
        return true;
    }

    Pet pet() {
        return  pet;
    }


    int bookingNumber() {
        return bookingNumber;
    }
}

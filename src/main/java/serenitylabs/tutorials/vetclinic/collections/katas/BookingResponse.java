package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

public class BookingResponse {

    private Pet pet;
    private int bookingNumber = 0;

    public BookingResponse(Pet pet) {
        this.pet = pet;
    }

    public boolean isConfirmed() {
        return true;
    }

    public Pet pet() {
        return  pet;
    }


    public int bookingNumber() {
        return bookingNumber;
    }
}

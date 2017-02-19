package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

/**
 * Created by 83018 on 18/02/2017.
 */
public class BookingResponse {

    private Pet pet;
    private int bookingNumber;

    public BookingResponse(){}

    public BookingResponse(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public boolean isConfirmed() {
        return true;
    }

    public boolean isOnWaitingList() {
        return false;
    }
}

package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

/**
 * Created by 83018 on 17/02/2017.
 */
public class BookingResponse {

    Pet pet;
    int bookingNumber;

    BookingResponse(Pet pet){
        this.pet = pet;
    }

    public boolean isFor(Pet bookedPet) {
        return pet.equals(bookedPet);
    }

    public int getBookingNumber() {
        return bookingNumber;
    }

    public boolean isConfirmed() {
        return true;
    }
}

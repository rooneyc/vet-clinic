package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Pet;

/**
 * Created by 83018 on 18/02/2017.
 */
public class BookingResponse {

    Pet pet;

    public BookingResponse(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }
}

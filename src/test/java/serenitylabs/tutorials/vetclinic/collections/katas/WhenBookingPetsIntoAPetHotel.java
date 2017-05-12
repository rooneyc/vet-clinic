package serenitylabs.tutorials.vetclinic.collections.katas;

import org.junit.Test;
import serenitylabs.tutorials.vetclinic.Breed;
import serenitylabs.tutorials.vetclinic.Pet;
import serenitylabs.tutorials.vetclinic.PetHotel;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenBookingPetsIntoAPetHotel {


    @Test
    public void the_hotel_should_initially_have_no_pets_booked() {

        //When
        PetHotel petHotel = new PetHotel();

        //Then
        assertThat(petHotel.getPets()).isEmpty();
    }

    @Test
    public void should_be_able_to_check_a_pet_into_the_hotel() throws Exception {

        //Given
        PetHotel petHotel = new PetHotel();
        Pet nemo = new Pet("Nemo", Breed.Fish);

        //When
        petHotel.checkIn(nemo);

        //Then
        assertThat(petHotel.getPets()).contains(nemo);
    }

    @Test
    public void should_be_able_to_check_in_several_pets() throws Exception {

        //Given
        PetHotel petHotel = new PetHotel();
        Pet nemo = new Pet("Nemo", Breed.Fish);
        Pet fido = new Pet("Fido", Breed.Dog);
        Pet garfield = new Pet("Garfield", Breed.Cat);

        //When
        petHotel.checkIn(nemo);
        petHotel.checkIn(fido);
        petHotel.checkIn(garfield);

        //Then
        assertThat(petHotel.getPets()).contains(nemo, fido, garfield);
    }

    @Test
    public void should_not_be_able_to_check_in_the_same_pet_twice() throws Exception {

        //Given
        PetHotel petHotel = new PetHotel();
        Pet nemo = new Pet("Nemo", Breed.Fish);

        //When
        petHotel.checkIn(nemo);
        petHotel.checkIn(nemo);

        //Then
        assertThat(petHotel.getPets()).containsExactly(nemo);
    }

    @Test
    public void should_be_able_to_obtain_a_booking_confirmation_when_we_check_in_a_pet() throws Exception {

        //Given
        PetHotel petHotel = new PetHotel();
        Pet nemo = new Pet("Nemo", Breed.Fish);

        //When
        BookingResponse response = petHotel.checkIn(nemo);

        //Then
        assertThat(response.pet()).isEqualTo(nemo);
        assertThat(response.bookingNumber()).isSameAs(0);
        assertThat(response.isConfirmed()).isTrue();

    }

    @Test
    public void should_be_able_to_retrieve_checked_in_pets_in_alphabetical_order() throws Exception {
    }

    @Test
    public void should_not_be_able_to_check_in_pets_beyond_hotel_capacity() throws Exception {
    }

    @Test
    public void should_notify_owner_that_the_hotel_is_full() throws Exception {
    }

    @Test
    public void should_place_pets_on_a_waiting_list_when_the_hotel_is_full() throws Exception {
    }

    @Test
    public void pets_on_the_waiting_list_should_be_added_to_the_hotel_when_a_place_is_freed() throws Exception {
    }


    @Test
    public void pets_on_the_waiting_list_should_be_admitted_on_a_first_come_first_served_basis() throws Exception {
    }

}

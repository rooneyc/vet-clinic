package serenitylabs.tutorials.vetclinic.collections.katas;

import org.junit.Test;
import serenitylabs.tutorials.vetclinic.Pet;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenBookingPetsIntoAPetHotel {


    @Test
    public void the_hotel_should_initially_have_no_pets_booked() {

        //Given
        PetHotel petHotel = new PetHotel();

        //Then
        assertThat(petHotel.getPets()).isEmpty();
    }

    @Test
    public void should_be_able_to_check_a_pet_into_the_hotel() throws Exception {

        //Given
        PetHotel petHotel = new PetHotel();
        Pet fido = Pet.dog().named("Fido");

        //When
        petHotel.checkIn(fido);

        //Then
        assertThat(petHotel.getPets()).contains(fido);
    }

    @Test
    public void should_be_able_to_check_in_several_pets() throws Exception {

        //Given
        PetHotel petHotel = new PetHotel();
        Pet fido = Pet.dog().named("Fido");
        Pet nemo = Pet.fish().named("Nemo");
        Pet rob = Pet.rabbit().named("Rob");

        //When
        petHotel.checkIn(fido);
        petHotel.checkIn(nemo);
        petHotel.checkIn(rob);

        //Then
        assertThat(petHotel.getPets()).contains(fido, nemo, rob);
    }

    @Test
    public void should_not_be_able_to_check_in_the_same_pet_twice() throws Exception {

        //Given
        PetHotel petHotel = new PetHotel();
        Pet fido = Pet.dog().named("Fido");

        //When
        petHotel.checkIn(fido);
        petHotel.checkIn(fido);

        //Then
        assertThat(petHotel.getPets()).containsOnlyOnce(fido);

    }

    @Test
    public void should_be_able_to_retrieve_checked_in_pets_in_alphabetical_order() throws Exception {

        //Given
        PetHotel petHotel = new PetHotel();
        Pet fido = Pet.dog().named("Fido");
        Pet nemo = Pet.fish().named("Nemo");
        Pet rob = Pet.rabbit().named("Rob");

        //When
        petHotel.checkIn(fido);
        petHotel.checkIn(nemo);
        petHotel.checkIn(rob);

        //Then
        assertThat(petHotel.getPets()).containsSequence(fido, nemo, rob);

    }

    @Test
    public void should_be_able_to_obtain_a_booking_confirmation_when_we_check_in_a_pet() throws Exception {
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

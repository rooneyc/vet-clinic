package serenitylabs.tutorials.vetclinic.collections.katas;

import org.junit.Test;
import serenitylabs.tutorials.vetclinic.Pet;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenBookingPetsIntoAPetHotel {

    @Test
    public void the_hotel_should_initially_have_no_pets_booked() throws Exception {

        //When
        PetHotel hotel = new PetHotel();

        //Then
        assertThat(hotel.getPets()).isEmpty();
    }

    @Test
    public void should_be_able_to_check_a_pet_into_the_hotel() throws Exception {

        //Given
        PetHotel hotel = new PetHotel();
        Pet stripe = Pet.rabbit().named("Stripe");

        //When
        hotel.checkIn(stripe);

        //Then
        assertThat(hotel.getPets()).contains(stripe);
    }

    @Test
    public void should_be_able_to_check_in_several_pets() throws Exception {

        //Given
        PetHotel hotel = new PetHotel();
        Pet stripe = Pet.rabbit().named("Stripe");
        Pet buddy = Pet.dog().named("Buddy");
        Pet fluffy = Pet.cat().named("Fluffy");

        //When
        hotel.checkIn(stripe);
        hotel.checkIn(buddy);
        hotel.checkIn(fluffy);

        //Then
        assertThat(hotel.getPets()).contains(stripe, buddy, fluffy);
    }

    @Test
    public void should_not_be_able_to_check_in_the_same_pet_twice() throws Exception {

        //Given
        PetHotel hotel = new PetHotel();
        Pet stripe = Pet.rabbit().named("Stripe");

        //When
        hotel.checkIn(stripe);
        hotel.checkIn(stripe);

        //Then
        assertThat(hotel.getPets()).containsExactly(stripe);
    }

    @Test
    public void should_be_able_to_obtain_a_booking_confirmation_when_we_check_in_a_pet() throws Exception {

        //Given
        PetHotel hotel = new PetHotel();
        Pet stripe = Pet.rabbit().named("Stripe");

        //When
        BookingResponse booking = hotel.checkIn(stripe);

        //Then
        assertThat(booking.pet()).isSameAs(stripe);
        assertThat(booking.bookingNumber()).isEqualTo(0);
        assertThat(booking.isConfirmed()).isTrue();
    }

    @Test
    public void should_be_able_to_retrieve_checked_in_pets_in_alphabetical_order() throws Exception {

        //Given
        PetHotel hotel = new PetHotel();
        Pet stripe = Pet.rabbit().named("Stripe");
        Pet buddy = Pet.dog().named("Buddy");
        Pet fluffy = Pet.cat().named("Fluffy");

        //When
        hotel.checkIn(stripe);
        hotel.checkIn(buddy);
        hotel.checkIn(fluffy);

        //Then
        assertThat(hotel.getPets()).containsSequence(buddy, fluffy, stripe);
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

package serenitylabs.tutorials.vetclinic.collections.katas;

import org.junit.Test;
import serenitylabs.tutorials.vetclinic.Breed;
import serenitylabs.tutorials.vetclinic.Pet;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenBookingPetsIntoAPetHotel {

    @Test
    public void the_hotel_should_initially_have_no_pets_booked() {
        PetHotel petHotel = new PetHotel();
        assertThat(petHotel.getPets()).isEmpty();
    }

    @Test
    public void should_be_able_to_check_a_pet_into_the_hotel() throws Exception {
        PetHotel petHotel = new PetHotel();
        Pet lassie = new Pet("Lassie", Breed.Dog);
        petHotel.checkIn(lassie);
        assertThat(petHotel.getPets()).contains(lassie);
    }

    @Test
    public void should_be_able_to_check_in_several_pets() throws Exception {
        PetHotel petHotel = new PetHotel();
        Pet lassie = new Pet("Lassie", Breed.Dog);
        Pet nemo = new Pet("Nemo", Breed.Fish);
        Pet lady = new Pet("Lady", Breed.Dog);
        petHotel.checkIn(lassie);
        petHotel.checkIn(nemo);
        petHotel.checkIn(lady);
        assertThat(petHotel.getPets()).contains(lassie);
        assertThat(petHotel.getPets()).contains(nemo);
        assertThat(petHotel.getPets()).contains(lady);
    }

    @Test
    public void should_not_be_able_to_check_in_the_same_pet_twice() throws Exception {
        PetHotel petHotel = new PetHotel();
        Pet lassie = new Pet("Lassie", Breed.Dog);
        petHotel.checkIn(lassie);
        petHotel.checkIn(lassie);
        assertThat(petHotel.getPets()).containsExactly(lassie);
    }

    @Test
    public void should_be_able_to_retrieve_checked_in_pets_in_alphabetical_order() throws Exception {
        PetHotel petHotel = new PetHotel();
        Pet lassie = new Pet("Lassie", Breed.Dog);
        Pet nemo = new Pet("Nemo", Breed.Fish);
        Pet lady = new Pet("Lady", Breed.Dog);
        petHotel.checkIn(lassie);
        petHotel.checkIn(nemo);
        petHotel.checkIn(lady);
        assertThat(petHotel.getPets()).containsSequence(lady, lassie, nemo);
    }

    @Test
    public void should_be_able_to_obtain_a_booking_confirmation_when_we_check_in_a_pet() throws Exception {
        PetHotel petHotel = new PetHotel();
        Pet lassie = new Pet("Lassie", Breed.Dog);
        BookingResponse bookingResponse = petHotel.checkIn(lassie);
        assertThat(bookingResponse.getPet()).isEqualTo(lassie);
        assertThat(bookingResponse.getBookingNumber()).isEqualTo(0);
        assertThat(bookingResponse.isConfirmed()).isTrue();
    }

    @Test
    public void should_not_be_able_to_check_in_pets_beyond_hotel_capacity() throws Exception {
        PetHotel petHotel = new PetHotel();

        Pet lassie = new Pet("Lassie", Breed.Dog);
        petHotel.checkIn(lassie);   //01
        Pet nemo = new Pet("Nemo", Breed.Fish);
        petHotel.checkIn(nemo);     //02
        Pet lady = new Pet("Lady", Breed.Dog);
        petHotel.checkIn(lady);     //03
        Pet garfield = new Pet("Garfield", Breed.Cat);
        petHotel.checkIn(garfield); //04
        Pet nermal = new Pet("Nermal", Breed.Cat);
        petHotel.checkIn(nermal);   //05
        Pet dog1 = new Pet("dog1", Breed.Dog);
        petHotel.checkIn(dog1);     //06
        Pet dog2 = new Pet("dog2", Breed.Dog);
        petHotel.checkIn(dog2);     //07
        Pet dog3 = new Pet("dog3", Breed.Dog);
        petHotel.checkIn(dog3);     //08
        Pet cat1 = new Pet("cat1", Breed.Cat);
        petHotel.checkIn(cat1);     //09
        Pet cat2 = new Pet("cat2", Breed.Cat);
        petHotel.checkIn(cat2);     //10
        Pet cat3 = new Pet("cat3", Breed.Cat);
        petHotel.checkIn(cat3);     //11
        Pet rabbit1 = new Pet("rabbit1", Breed.Rabbit);
        petHotel.checkIn(rabbit1);  //12
        Pet rabbit2 = new Pet("rabbit2", Breed.Rabbit);
        petHotel.checkIn(rabbit2);  //13
        Pet rabbit3 = new Pet("rabbit3", Breed.Rabbit);
        petHotel.checkIn(rabbit3);  //14
        Pet fish1 = new Pet("fish1", Breed.Fish);
        petHotel.checkIn(fish1);    //15
        Pet fish2 = new Pet("fish2", Breed.Fish);
        petHotel.checkIn(fish2);    //16
        Pet fish3 = new Pet("fish3", Breed.Fish);
        petHotel.checkIn(fish3);    //17
        Pet parrot1 = new Pet("parrot1", Breed.Parrot);
        petHotel.checkIn(parrot1);  //18
        Pet parrot2 = new Pet("parrot2", Breed.Parrot);
        petHotel.checkIn(parrot2);  //19
        Pet parrot3 = new Pet("parrot3", Breed.Parrot);
        petHotel.checkIn(parrot3);  //20
        Pet parrot4 = new Pet("parrot4", Breed.Parrot);
        petHotel.checkIn(parrot4);  //21

        assertThat(petHotel.getPets()).doesNotContain(parrot4);
    }

    @Test
    public void should_notify_owner_that_the_hotel_is_full() throws Exception {

        PetHotel petHotel = new PetHotel();

        Pet lassie = new Pet("Lassie", Breed.Dog);
        petHotel.checkIn(lassie);   //01
        Pet nemo = new Pet("Nemo", Breed.Fish);
        petHotel.checkIn(nemo);     //02
        Pet lady = new Pet("Lady", Breed.Dog);
        petHotel.checkIn(lady);     //03
        Pet garfield = new Pet("Garfield", Breed.Cat);
        petHotel.checkIn(garfield); //04
        Pet nermal = new Pet("Nermal", Breed.Cat);
        petHotel.checkIn(nermal);   //05
        Pet dog1 = new Pet("dog1", Breed.Dog);
        petHotel.checkIn(dog1);     //06
        Pet dog2 = new Pet("dog2", Breed.Dog);
        petHotel.checkIn(dog2);     //07
        Pet dog3 = new Pet("dog3", Breed.Dog);
        petHotel.checkIn(dog3);     //08
        Pet cat1 = new Pet("cat1", Breed.Cat);
        petHotel.checkIn(cat1);     //09
        Pet cat2 = new Pet("cat2", Breed.Cat);
        petHotel.checkIn(cat2);     //10
        Pet cat3 = new Pet("cat3", Breed.Cat);
        petHotel.checkIn(cat3);     //11
        Pet rabbit1 = new Pet("rabbit1", Breed.Rabbit);
        petHotel.checkIn(rabbit1);  //12
        Pet rabbit2 = new Pet("rabbit2", Breed.Rabbit);
        petHotel.checkIn(rabbit2);  //13
        Pet rabbit3 = new Pet("rabbit3", Breed.Rabbit);
        petHotel.checkIn(rabbit3);  //14
        Pet fish1 = new Pet("fish1", Breed.Fish);
        petHotel.checkIn(fish1);    //15
        Pet fish2 = new Pet("fish2", Breed.Fish);
        petHotel.checkIn(fish2);    //16
        Pet fish3 = new Pet("fish3", Breed.Fish);
        petHotel.checkIn(fish3);    //17
        Pet parrot1 = new Pet("parrot1", Breed.Parrot);
        petHotel.checkIn(parrot1);  //18
        Pet parrot2 = new Pet("parrot2", Breed.Parrot);
        petHotel.checkIn(parrot2);  //19
        Pet parrot3 = new Pet("parrot3", Breed.Parrot);
        petHotel.checkIn(parrot3);  //20

        Pet parrot4 = new Pet("parrot4", Breed.Parrot);
        BookingResponse response = petHotel.checkIn(parrot4);  //21

        assertThat(response.isConfirmed()).isFalse();
        assertThat(response.isOnWaitingList()).isTrue();
    }

    @Test
    public void should_place_pets_on_a_waiting_list_when_the_hotel_is_full() throws Exception {

        PetHotel petHotel = new PetHotel();

        Pet lassie = new Pet("Lassie", Breed.Dog);
        petHotel.checkIn(lassie);   //01
        Pet nemo = new Pet("Nemo", Breed.Fish);
        petHotel.checkIn(nemo);     //02
        Pet lady = new Pet("Lady", Breed.Dog);
        petHotel.checkIn(lady);     //03
        Pet garfield = new Pet("Garfield", Breed.Cat);
        petHotel.checkIn(garfield); //04
        Pet nermal = new Pet("Nermal", Breed.Cat);
        petHotel.checkIn(nermal);   //05
        Pet dog1 = new Pet("dog1", Breed.Dog);
        petHotel.checkIn(dog1);     //06
        Pet dog2 = new Pet("dog2", Breed.Dog);
        petHotel.checkIn(dog2);     //07
        Pet dog3 = new Pet("dog3", Breed.Dog);
        petHotel.checkIn(dog3);     //08
        Pet cat1 = new Pet("cat1", Breed.Cat);
        petHotel.checkIn(cat1);     //09
        Pet cat2 = new Pet("cat2", Breed.Cat);
        petHotel.checkIn(cat2);     //10
        Pet cat3 = new Pet("cat3", Breed.Cat);
        petHotel.checkIn(cat3);     //11
        Pet rabbit1 = new Pet("rabbit1", Breed.Rabbit);
        petHotel.checkIn(rabbit1);  //12
        Pet rabbit2 = new Pet("rabbit2", Breed.Rabbit);
        petHotel.checkIn(rabbit2);  //13
        Pet rabbit3 = new Pet("rabbit3", Breed.Rabbit);
        petHotel.checkIn(rabbit3);  //14
        Pet fish1 = new Pet("fish1", Breed.Fish);
        petHotel.checkIn(fish1);    //15
        Pet fish2 = new Pet("fish2", Breed.Fish);
        petHotel.checkIn(fish2);    //16
        Pet fish3 = new Pet("fish3", Breed.Fish);
        petHotel.checkIn(fish3);    //17
        Pet parrot1 = new Pet("parrot1", Breed.Parrot);
        petHotel.checkIn(parrot1);  //18
        Pet parrot2 = new Pet("parrot2", Breed.Parrot);
        petHotel.checkIn(parrot2);  //19
        Pet parrot3 = new Pet("parrot3", Breed.Parrot);
        petHotel.checkIn(parrot3);  //20

        Pet parrot4 = new Pet("parrot4", Breed.Parrot);
        petHotel.checkIn(parrot4);  //21

        assertThat(petHotel.getWaitingList()).contains(parrot4);
    }

    @Test
    public void pets_on_the_waiting_list_should_be_added_to_the_hotel_when_a_place_is_freed() throws Exception {

        PetHotel petHotel = new PetHotel();

        Pet lassie = new Pet("Lassie", Breed.Dog);
        petHotel.checkIn(lassie);   //01
        Pet nemo = new Pet("Nemo", Breed.Fish);
        petHotel.checkIn(nemo);     //02
        Pet lady = new Pet("Lady", Breed.Dog);
        petHotel.checkIn(lady);     //03
        Pet garfield = new Pet("Garfield", Breed.Cat);
        petHotel.checkIn(garfield); //04
        Pet nermal = new Pet("Nermal", Breed.Cat);
        petHotel.checkIn(nermal);   //05
        Pet dog1 = new Pet("dog1", Breed.Dog);
        petHotel.checkIn(dog1);     //06
        Pet dog2 = new Pet("dog2", Breed.Dog);
        petHotel.checkIn(dog2);     //07
        Pet dog3 = new Pet("dog3", Breed.Dog);
        petHotel.checkIn(dog3);     //08
        Pet cat1 = new Pet("cat1", Breed.Cat);
        petHotel.checkIn(cat1);     //09
        Pet cat2 = new Pet("cat2", Breed.Cat);
        petHotel.checkIn(cat2);     //10
        Pet cat3 = new Pet("cat3", Breed.Cat);
        petHotel.checkIn(cat3);     //11
        Pet rabbit1 = new Pet("rabbit1", Breed.Rabbit);
        petHotel.checkIn(rabbit1);  //12
        Pet rabbit2 = new Pet("rabbit2", Breed.Rabbit);
        petHotel.checkIn(rabbit2);  //13
        Pet rabbit3 = new Pet("rabbit3", Breed.Rabbit);
        petHotel.checkIn(rabbit3);  //14
        Pet fish1 = new Pet("fish1", Breed.Fish);
        petHotel.checkIn(fish1);    //15
        Pet fish2 = new Pet("fish2", Breed.Fish);
        petHotel.checkIn(fish2);    //16
        Pet fish3 = new Pet("fish3", Breed.Fish);
        petHotel.checkIn(fish3);    //17
        Pet parrot1 = new Pet("parrot1", Breed.Parrot);
        petHotel.checkIn(parrot1);  //18
        Pet parrot2 = new Pet("parrot2", Breed.Parrot);
        petHotel.checkIn(parrot2);  //19
        Pet parrot3 = new Pet("parrot3", Breed.Parrot);
        petHotel.checkIn(parrot3);  //20

        Pet parrot4 = new Pet("parrot4", Breed.Parrot);
        petHotel.checkIn(parrot4);  //21

        petHotel.checkOut(lassie);

        assertThat(petHotel.getPets()).contains(parrot4);

    }

    @Test
    public void pets_on_the_waiting_list_should_be_admitted_on_a_first_come_first_served_basis() throws Exception {
        //Covered by pets_on_the_waiting_list_should_be_added_to_the_hotel_when_a_place_is_freed  ???
        //Tutorial for pets_on_the_waiting_list_should_be_added_to_the_hotel_when_a_place_is_freed
        //says "Ensure that when a pet checks out of the hotel, the first pet on the waiting list is automatically checked in. "

        PetHotel petHotel = new PetHotel();

        Pet lassie = new Pet("Lassie", Breed.Dog);
        petHotel.checkIn(lassie);   //01
        Pet nemo = new Pet("Nemo", Breed.Fish);
        petHotel.checkIn(nemo);     //02
        Pet lady = new Pet("Lady", Breed.Dog);
        petHotel.checkIn(lady);     //03
        Pet garfield = new Pet("Garfield", Breed.Cat);
        petHotel.checkIn(garfield); //04
        Pet nermal = new Pet("Nermal", Breed.Cat);
        petHotel.checkIn(nermal);   //05
        Pet dog1 = new Pet("dog1", Breed.Dog);
        petHotel.checkIn(dog1);     //06
        Pet dog2 = new Pet("dog2", Breed.Dog);
        petHotel.checkIn(dog2);     //07
        Pet dog3 = new Pet("dog3", Breed.Dog);
        petHotel.checkIn(dog3);     //08
        Pet cat1 = new Pet("cat1", Breed.Cat);
        petHotel.checkIn(cat1);     //09
        Pet cat2 = new Pet("cat2", Breed.Cat);
        petHotel.checkIn(cat2);     //10
        Pet cat3 = new Pet("cat3", Breed.Cat);
        petHotel.checkIn(cat3);     //11
        Pet rabbit1 = new Pet("rabbit1", Breed.Rabbit);
        petHotel.checkIn(rabbit1);  //12
        Pet rabbit2 = new Pet("rabbit2", Breed.Rabbit);
        petHotel.checkIn(rabbit2);  //13
        Pet rabbit3 = new Pet("rabbit3", Breed.Rabbit);
        petHotel.checkIn(rabbit3);  //14
        Pet fish1 = new Pet("fish1", Breed.Fish);
        petHotel.checkIn(fish1);    //15
        Pet fish2 = new Pet("fish2", Breed.Fish);
        petHotel.checkIn(fish2);    //16
        Pet fish3 = new Pet("fish3", Breed.Fish);
        petHotel.checkIn(fish3);    //17
        Pet parrot1 = new Pet("parrot1", Breed.Parrot);
        petHotel.checkIn(parrot1);  //18
        Pet parrot2 = new Pet("parrot2", Breed.Parrot);
        petHotel.checkIn(parrot2);  //19
        Pet parrot3 = new Pet("parrot3", Breed.Parrot);
        petHotel.checkIn(parrot3);  //20

        Pet parrot4 = new Pet("parrot4", Breed.Parrot);
        petHotel.checkIn(parrot4);  //21
        Pet parrot5 = new Pet("parrot5", Breed.Parrot);
        petHotel.checkIn(parrot5);  //21

        petHotel.checkOut(lassie);

        assertThat(petHotel.getPets()).contains(parrot4);
        assertThat(petHotel.getPets()).doesNotContain(parrot5);
    }

}

package serenitylabs.tutorials.vetclinic.collections.katas;

import com.google.common.collect.ImmutableList;
import serenitylabs.tutorials.vetclinic.Breed;
import serenitylabs.tutorials.vetclinic.Pet;

import java.util.List;
import java.util.Random;

/**
 * A utility class to generate pet hotels with pets already booked
 */
class APetHotel {

    private APetHotel(){
        //Hide Public Constructor
    }

    static PetAdder with(int petCount) {
        return new PetAdder(petCount);
    }

   static class PetAdder {

        private static final Random random = new Random();

        private static final List<String> PET_NAMES = ImmutableList.of("Fido","Felix","Rover","Spot");

        private final int petCount;

        PetAdder(int petCount) {

            this.petCount = petCount;
        }

        PetHotel petsCheckedIn() {
            PetHotel petHotel = new PetHotel();
            for (int i = 0; i < petCount; i++) {
                petHotel.checkIn(somePet(i));
            }
            return petHotel;
        }

        private Pet somePet(int petCount) {
            return new Pet(someName(petCount), someBreed());
        }

        private Breed someBreed() {
            return Breed.values()[ random.nextInt(Breed.values().length) ];
        }

        private String someName(int petCount) {
            return PET_NAMES.get(random.nextInt(PET_NAMES.size())) + " " + petCount;
        }
    }
}

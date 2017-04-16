package serenitylabs.tutorials.vetclinic.collections.katas;

import serenitylabs.tutorials.vetclinic.Breed;
import serenitylabs.tutorials.vetclinic.Pet;

import java.util.HashMap;
import java.util.Map;

public class PetCatalog {

    public static final Map<Breed, Integer> GRAMS_PER_KILO_FOR_BREED = new HashMap<>();
    static {
        GRAMS_PER_KILO_FOR_BREED.put(Breed.Dog ,20);
        GRAMS_PER_KILO_FOR_BREED.put(Breed.Cat ,10);
    }

    public static final Map<Breed, PetFood> BRAND_FOR_BREED = new HashMap<>();
    static {
        BRAND_FOR_BREED.put(Breed.Cat ,PetFood.KittyKat);
        BRAND_FOR_BREED.put(Breed.Dog ,PetFood.FidosFood);
    }

    public static PetFood rightFoodFor(Pet pet) {
        return BRAND_FOR_BREED.get(pet.getBreed());
    }

    public static double rightAmountOfFoodFor(Pet pet) {
        return pet.getWeightInKilos() * GRAMS_PER_KILO_FOR_BREED.get(pet.getBreed());
    }

}

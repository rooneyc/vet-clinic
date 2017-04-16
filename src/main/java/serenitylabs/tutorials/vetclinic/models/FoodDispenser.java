package serenitylabs.tutorials.vetclinic.models;

import serenitylabs.tutorials.vetclinic.Meal;
import serenitylabs.tutorials.vetclinic.Pet;

import static serenitylabs.tutorials.vetclinic.collections.katas.PetCatalog.rightAmountOfFoodFor;
import static serenitylabs.tutorials.vetclinic.collections.katas.PetCatalog.rightFoodFor;

public class FoodDispenser {

    public Meal prepareMealFor(Pet pet) {
        return new Meal(rightAmountOfFoodFor(pet), rightFoodFor(pet));
    }

}

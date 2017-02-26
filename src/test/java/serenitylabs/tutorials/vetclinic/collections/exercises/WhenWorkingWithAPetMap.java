package serenitylabs.tutorials.vetclinic.collections.exercises;

import org.junit.Test;
import serenitylabs.tutorials.vetclinic.Breed;
import serenitylabs.tutorials.vetclinic.Pet;

import java.util.*;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class WhenWorkingWithAPetMap {

    @Test
    public void pets_can_be_found_by_their_name() {

        //Given
        Map<String, Pet> pets = new HashMap<>();
        Pet fido = Pet.dog().named("Fido");

        //When
        pets.put("Fido", fido);

        //Then
        org.assertj.core.api.Assertions.assertThat(pets.get("Fido")).isSameAs(fido);
    }

    @Test
    public void should_be_able_to_get_a_default_value_if_no_matching_key_is_present() {

        //Given
        Map<String, Pet> pets = new HashMap<>();

        Pet fido = Pet.dog().named("Fido");
        Pet stray = Pet.dog().named("Stray");

        //When
        pets.put("Fido", fido);
        pets.put("Stray", stray);

        //Then
        org.assertj.core.api.Assertions.assertThat(pets.getOrDefault("Felix", stray)).isSameAs(stray);
    }

    @Test
    public void the_map_keys_should_be_the_pet_names() {

        //Given
        Map<String, Pet> pets = new HashMap<>();

        Pet fido = Pet.dog().named("Fido");
        Pet felix = Pet.cat().named("Felix");

        //When
        pets.put("Fido", fido);
        pets.put("Felix", felix);

        //Then
        for (Map.Entry<String, Pet> entry: pets.entrySet()) {
            org.assertj.core.api.Assertions.assertThat(entry.getKey()).isSameAs(entry.getValue().getName());
        }
    }

    @Test
    public void the_map_should_store_pets_in_alphabetical_order() {

        //Given
        NavigableMap<String, Pet> pets = new TreeMap<>();

        //When
        pets.put("Rover", Pet.dog().named("Rover"));
        pets.put("Felix", Pet.cat().named("Felix"));
        pets.put("Spot", Pet.cat().named("Spot"));

        //Then
        assertThat(pets.keySet(), contains("Felix","Rover","Spot"));
    }

    @Test
    public void the_map_should_store_pets_in_the_order_they_where_added() {

        //Given
        Map<String, Pet> pets =  new LinkedHashMap<>();

        //When
        pets.put("Spot", Pet.cat().named("Spot"));
        pets.put("Rover", Pet.dog().named("Rover"));
        pets.put("Felix", Pet.cat().named("Felix"));
        pets.put("Fido", Pet.cat().named("Fido"));

        //Then
        assertThat(pets.keySet(), contains("Spot", "Rover","Felix", "Fido"));
    }

    @Test
    public void the_map_should_store_pet_leaders_by_breed() {

        //Given
        EnumMap<Breed, Pet> petLeaders =  new EnumMap<>(Breed.class);

        petLeaders.put(Breed.Cat, Pet.cat().named("Felix"));
        petLeaders.put(Breed.Dog, Pet.dog().named("Lassie"));
        petLeaders.put(Breed.Rabbit, Pet.cat().named("Hazel"));

        assertThat(petLeaders.get(Breed.Dog).getName(), equalTo("Lassie"));
    }

}

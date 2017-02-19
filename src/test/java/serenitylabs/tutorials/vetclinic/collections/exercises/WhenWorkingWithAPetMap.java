package serenitylabs.tutorials.vetclinic.collections.exercises;

import org.junit.Test;
import serenitylabs.tutorials.vetclinic.Breed;
import serenitylabs.tutorials.vetclinic.Pet;

import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class WhenWorkingWithAPetMap {

    @Test
    public void pets_can_be_found_by_their_name() {
        Map<String, Pet> pets = new HashMap<>();

        Pet fido = Pet.dog().named("Fido");

        pets.put("Fido", fido);

        org.assertj.core.api.Assertions.assertThat(pets.get("Fido")).isSameAs(fido);
    }

    @Test
    public void should_be_able_to_get_a_default_value_if_no_matching_key_is_present() {
        Map<String, Pet> pets = new HashMap<>();

        Pet fido = Pet.dog().named("Fido");
        Pet stray = Pet.dog().named("Stray");

        pets.put("Fido", fido);
        pets.put("Stray", stray);

        org.assertj.core.api.Assertions.assertThat(pets.getOrDefault("default", stray)).isSameAs(stray);
    }

    @Test
    public void the_map_keys_should_be_the_pet_names() {
        Map<String, Pet> pets = new HashMap<>();

        Pet fido = Pet.dog().named("Fido");
        Pet felix = Pet.cat().named("Felix");

        pets.put("Fido", fido);
        pets.put("Felix", felix);

        org.assertj.core.api.Assertions.assertThat(pets.keySet()).contains(fido.getName(), felix.getName());

        //if this enough?
        //what if map was
        // | Key   | Value |
        // | Felix | Fido  |
        // | Fido  | Felix |
        //above would still pass

        for (Map.Entry<String, Pet> entry : pets.entrySet())
        {
            org.assertj.core.api.Assertions.assertThat(entry.getKey()).isEqualTo(entry.getValue().getName());
        }
    }

    @Test
    public void the_map_should_store_pets_in_alphabetical_order() {
        // TODO: Instantiate the correct type of Map
        NavigableMap<String, Pet> pets = new TreeMap<>();

        pets.put("Rover", Pet.dog().named("Rover"));
        pets.put("Felix", Pet.cat().named("Felix"));
        pets.put("Spot", Pet.cat().named("Spot"));

        assertThat(pets.keySet(), contains("Felix","Rover","Spot"));
    }

    @Test
    public void the_map_should_store_pets_in_the_order_they_where_added() {
        // TODO: Instantiate the correct type of Map
        Map<String, Pet> pets =  new LinkedHashMap<>();

        pets.put("Spot", Pet.cat().named("Spot"));
        pets.put("Rover", Pet.dog().named("Rover"));
        pets.put("Felix", Pet.cat().named("Felix"));
        pets.put("Fido", Pet.cat().named("Fido"));

        assertThat(pets.keySet(), contains("Spot", "Rover","Felix", "Fido"));
    }

    @Test
    public void the_map_should_store_pet_leaders_by_breed() {
        // TODO: Create an EnumMap to define a pet leader for each breed
        EnumMap<Breed, Pet> petLeaders =  new EnumMap<>(Breed.class);

        petLeaders.put(Breed.Cat, Pet.cat().named("Felix"));
        petLeaders.put(Breed.Dog, Pet.dog().named("Lassie"));
        petLeaders.put(Breed.Rabbit, Pet.cat().named("Hazel"));

        assertThat(petLeaders.get(Breed.Dog).getName(), equalTo("Lassie"));
    }

}

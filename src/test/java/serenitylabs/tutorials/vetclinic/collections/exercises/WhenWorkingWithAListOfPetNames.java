package serenitylabs.tutorials.vetclinic.collections.exercises;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class WhenWorkingWithAListOfPetNames {

    @Test
    public void should_add_Fido_to_the_list_of_pets() {
        List<String> names = Lists.newArrayList();

        names.add("Fido");
        assertThat(names, contains("Fido"));
    }

    @Test
    public void should_remove_Fido_from_the_list_of_pets() {
        List<String> names = Lists.newArrayList("Felix","Fido","Spot");
        names.remove("Fido");

        assertThat(names, contains("Felix","Spot"));
    }

    @Test
    public void should_remove_the_first_pet_from_the_list_of_pets() {
        List<String> names = Lists.newArrayList("Felix","Fido","Spot");

        names.remove(0);

        assertThat(names, contains("Fido","Spot"));
    }

    @Test
    public void should_make_a_list_of_cats_and_dogs() {
        List<String> cats = Lists.newArrayList("Felix","Spot");
        List<String> dogs = Lists.newArrayList("Fido","Rover");

        List<String> catsAndDogs = new ArrayList<>(cats);
        catsAndDogs.addAll(dogs);

        assertThat(catsAndDogs, contains("Felix","Spot","Fido","Rover"));
    }

    @Test
    public void should_put_the_dogs_among_the_cats() {
        List<String> cats = Lists.newArrayList("Felix","Spot");
        List<String> dogs = Lists.newArrayList("Fido","Rover");

        List<String> catsAndDogs = new ArrayList<>(cats);
        catsAndDogs.addAll(1, dogs);

        assertThat(catsAndDogs, contains("Felix","Fido","Rover","Spot"));
    }

    @Test
    public void should_organise_pets_in_alphabetical_order() {
        List<String> pets = Lists.newArrayList("Felix","Spot","Fido","Rover");

        Collections.sort(pets);

        assertThat(pets, contains("Felix","Fido","Rover","Spot"));
    }

    @Test
    public void should_organise_pets_in_reverse_alphabetical_order() {
        List<String> pets = Lists.newArrayList("Felix","Spot","Fido","Rover");

        Collections.sort(pets);
        Collections.reverse(pets);

        assertThat(pets, contains("Spot","Rover","Fido","Felix"));
    }

    @Test
    public void should_organise_pets_by_name_length() {
        List<String> pets = Lists.newArrayList("Felix","Alfred","Spot");

        class OrderByNameLength implements Comparator<String> {

           @Override
           public int compare(String o1, String o2) {
               return o1.length() - o2.length();
           }
        }

        pets.sort(new OrderByNameLength());
        assertThat(pets, contains("Spot","Felix","Alfred"));
    }

}

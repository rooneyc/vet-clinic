package serenitylabs.tutorials.vetclinic.collections.exercises;

import com.google.common.collect.Lists;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class WhenWorkingWithAListOfPetNames {

    @Test
    public void should_add_Fido_to_the_list_of_pets() {

        //Given
        List<String> names = Lists.newArrayList();

        //When
        names.add("Fido");

        //Then
        assertThat(names, contains("Fido"));
    }

    @Test
    public void should_remove_Fido_from_the_list_of_pets() {

        //Given
        List<String> names = Lists.newArrayList("Felix","Fido","Spot");

        //When
        names.remove("Fido");

        //Then
        assertThat(names, contains("Felix","Spot"));
    }

    @Test
    public void should_remove_the_first_pet_from_the_list_of_pets() {

        //Given
        List<String> names = Lists.newArrayList("Felix","Fido","Spot");

        //When
        names.remove(0);

        //Then
        assertThat(names, contains("Fido","Spot"));
    }

    @Test
    public void should_make_a_list_of_cats_and_dogs() {

        //Given
        List<String> cats = Lists.newArrayList("Felix","Spot");
        List<String> dogs = Lists.newArrayList("Fido","Rover");

        //When
        List<String> catsAndDogs = new ArrayList<>(cats);
        catsAndDogs.addAll(dogs);

        //Then
        assertThat(catsAndDogs, contains("Felix","Spot","Fido","Rover"));
    }

    @Test
    public void should_put_the_dogs_among_the_cats() {

        //Given
        List<String> cats = Lists.newArrayList("Felix","Spot");
        List<String> dogs = Lists.newArrayList("Fido","Rover");

        //When
        List<String> catsAndDogs = new ArrayList<>(cats);
        catsAndDogs.addAll(1, dogs);

        //Then
        assertThat(catsAndDogs, contains("Felix","Fido","Rover","Spot"));
    }

    @Test
    public void should_organise_pets_in_alphabetical_order() {

        //Given
        List<String> pets = Lists.newArrayList("Felix","Spot","Fido","Rover");

        //When
        Collections.sort(pets);

        //Then
        assertThat(pets, contains("Felix","Fido","Rover","Spot"));
    }

    @Test
    public void should_organise_pets_in_reverse_alphabetical_order() {

        //Given
        List<String> pets = Lists.newArrayList("Felix","Spot","Fido","Rover");

        //When
        Collections.sort(pets);
        Collections.reverse(pets);

        //Then
        assertThat(pets, contains("Spot","Rover","Fido","Felix"));
    }

    @Test
    public void should_organise_pets_by_name_length() {

        //Given
        List<String> pets = Lists.newArrayList("Felix","Alfred","Spot");

        //When

        Comparator<String> byNameLengthAsc = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Collections.sort(pets, byNameLengthAsc);

        //Then
        assertThat(pets, contains("Spot","Felix","Alfred"));
    }

}

package serenitylabs.tutorials.vetclinic.collections.exercises;

import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithASetOfPets {

    @Test
    public void should_add_Fido_to_the_set_of_pets() {

       //Given
        Set<String> names = Sets.newHashSet();

        //When
        names.add("Fido");

        //Then
        assertThat(names).contains("Fido");
    }

    @Test
    public void a_set_of_pets_should_not_contain_duplicates() {

        //Given
        Set<String> names = Sets.newHashSet();

        //When
        names.add("Fido");
        names.add("Felix");
        names.add("Fido");

        //Then
        assertThat(names).containsOnlyOnce("Fido");
    }

    @Test
    public void adding_several_pets() {

        //Given
        Set<String> names = Sets.newHashSet("Fido","Felix");

        //When
        names.addAll(Sets.newHashSet("Felix","Spot"));

        //Then
        assertThat(names).contains("Fido", "Spot", "Felix");
    }


}

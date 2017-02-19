package serenitylabs.tutorials.vetclinic.enumerations.exercises;

import org.junit.Test;
import serenitylabs.tutorials.vetclinic.Gender;
import serenitylabs.tutorials.vetclinic.Pet;
import static org.assertj.core.api.Assertions.assertThat;

public class WhenCreatingASimpleEnum {

    @Test
    public void the_gender_of_a_pet_should_be_considered_unknown_by_default() {

        // TODO: Add a gender field to the Pet class that takes two possible values: Male, Female and Unknown

        Pet unidentifiedTabby = Pet.cat().named("unidentifiedTabby");

        // TODO: assertThat(unidentifiedTabby.getGender(), equalTo(Gender.Unknown));

        assertThat(Gender.Unknown).isEqualTo(unidentifiedTabby.getGender());


    }

    @Test
    public void the_gender_of_a_pet_can_be_provided() {

        // TODO: Refactor the Pet builder method to allow the following construct:

        Pet lassie = Pet.dog().named("Lassie").withGender(Gender.Male);

        // TODO:
        // assertThat(lassie.getGender(), equalTo(Gender.Male));

        assertThat(Gender.Male).isEqualTo(lassie.getGender());

    }

}

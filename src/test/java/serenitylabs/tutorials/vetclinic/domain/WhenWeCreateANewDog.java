package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.*;

public class WhenWeCreateANewDog {

    @Test
    public void a_new_dog_should_have_a_name_and_a_breed_and_a_colour() throws Exception {
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");

        Assert.assertEquals("Fido",fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        org.assertj.core.api.Assertions.assertThat(fido.getColours()).containsExactly("Black");
    }

    @Test
    public void a_dog_should_be_printed_in_a_readable_form() throws Exception {

        //When
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black");

        //Then
        org.junit.Assert.assertThat(fido.toString(), is(equalTo("Fido the black labrador")));
        org.assertj.core.api.Assertions.assertThat(fido.toString()).isEqualTo("Fido the black labrador");

        org.junit.Assert.assertThat(fido.toString(), startsWith("Fido"));
        org.assertj.core.api.Assertions.assertThat(fido.toString()).startsWith("Fido");

        org.junit.Assert.assertThat(fido.toString(), endsWith("labrador"));
        org.assertj.core.api.Assertions.assertThat(fido.toString()).endsWith("labrador");

        org.junit.Assert.assertThat(fido.toString(), containsString("black"));
        org.assertj.core.api.Assertions.assertThat(fido.toString()).contains("black");
    }

    @Test
    public void a_dog_can_have_several_colours() throws Exception {

        //When
        Dog fido = Dog.called("Fido").ofBreed("Labrador").andOfColour("Black", "White");

        //Then
        org.junit.Assert.assertThat(fido.getColours(), contains("Black", "White"));
        org.assertj.core.api.Assertions.assertThat(fido.getColours()).containsExactly("Black", "White");

        org.junit.Assert.assertThat(fido.getColours(), hasItem("Black"));
        org.assertj.core.api.Assertions.assertThat(fido.getColours()).contains("Black");

        org.junit.Assert.assertThat(fido.getColours(), not(hasItem("Red")));
        org.assertj.core.api.Assertions.assertThat(fido.getColours()).doesNotContain("Red");



    }
}


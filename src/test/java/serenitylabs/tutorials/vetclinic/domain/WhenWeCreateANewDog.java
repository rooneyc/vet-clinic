package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

public class WhenWeCreateANewDog {

    @Test
    public void a_new_dog_should_have_a_name() throws Exception {

        //When
        Dog fido = new Dog("Fido", "Labrador");

        //Then
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getBreed(), "Labrador");

    }
}

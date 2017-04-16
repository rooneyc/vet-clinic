package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

public class WhenWeCreateANewDog {

    @Test
    public void a_new_dog_should_have_a_name() throws Exception {

        //Given
        Dog fido = new Dog();

        //When
        fido.setName("Fido");

        //Then
        Assert.assertEquals(fido.getName(), "Fido");

    }
}

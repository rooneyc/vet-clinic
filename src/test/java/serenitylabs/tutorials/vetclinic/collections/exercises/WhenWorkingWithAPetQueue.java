package serenitylabs.tutorials.vetclinic.collections.exercises;

import org.junit.Test;
import serenitylabs.tutorials.vetclinic.Pet;

import java.util.LinkedList;
import java.util.Queue;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithAPetQueue {

    @Test
    public void should_add_Fido_to_the_end_of_the_queue() {

        //Given
        Queue<Pet> waitingList = new LinkedList<>();

        //When
        waitingList.add(Pet.cat().named("Felix"));
        waitingList.add(Pet.dog().named("Fido"));

        //Then
        assertThat(waitingList.poll().getName()).isSameAs("Felix");
    }

    @Test
    public void should_see_who_is_at_the_top_of_the_queue_without_removing_it() {

        //Given
        Queue<Pet> waitingList = new LinkedList<>();

        //When
        waitingList.add(Pet.cat().named("Felix"));
        waitingList.add(Pet.dog().named("Fido"));

        //Then
        assertThat(waitingList.peek().getName()).isSameAs("Felix");
        assertThat(waitingList.peek().getName()).isSameAs("Felix");
    }


}


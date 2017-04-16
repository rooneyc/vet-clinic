package serenitylabs.tutorials.vetclinic.playingball;

import org.junit.Test;
import serenitylabs.tutorials.vetclinic.playingball.model.Child;
import serenitylabs.tutorials.vetclinic.playingball.model.Game;

import static org.assertj.core.api.Assertions.assertThat;
import static serenitylabs.tutorials.vetclinic.playingball.SampleDates.*;

public class WhenPlayingBall {

    @Test
    public void should_play_football_on_sundays() {

        //Given
        Child bill = new Child();

        //When
        Game gamePlayed = bill.goPlayBallOn(A_SUNDAY);

        //Then
        assertThat(gamePlayed).isEqualTo(Game.Football);
    }

    @Test
    public void should_play_football_on_saturdays() throws Exception {

        //Given
        Child bill = new Child();

        //When
        Game gamePlayed = bill.goPlayBallOn(A_SATURDAY);

        //Then
        assertThat(gamePlayed).isEqualTo(Game.Football);
    }

    @Test
    public void should_play_handball_on_week_days() throws Exception {

        //Given
        Child bill = new Child();

        //When
        Game gamePlayed = bill.goPlayBallOn(A_MONDAY);

        //Then
        assertThat(gamePlayed).isEqualTo(Game.Handball);
    }

    @Test
    public void should_play_tennis_on_wednesdays() throws Exception {

        //Given
        Child bill = new Child();

        //When
        Game gamePlayed = bill.goPlayBallOn(A_WEDNESDAY);

        //Then
        assertThat(gamePlayed).isEqualTo(Game.Tennis);

    }
}

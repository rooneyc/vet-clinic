package serenitylabs.tutorials.vetclinic.playingball.model;

import java.time.LocalDate;

import static serenitylabs.tutorials.vetclinic.playingball.model.Season.SUMMER;
import static serenitylabs.tutorials.vetclinic.playingball.model.Season.WINTER;

public class SchoolSportsSchedule implements GameSchedule {

    @Override
    public PlayBall forGameOn(LocalDate currentDay) {
        if (Season.of(currentDay.getMonth()).equals(SUMMER)) {
            return new PlayCriket();
        }
        if (Season.of(currentDay.getMonth()).equals(WINTER)) {
            return new PlayTennis();
        }
        throw new IllegalArgumentException("Day does not have a valid Season");
    }
}

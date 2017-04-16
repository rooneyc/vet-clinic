package serenitylabs.tutorials.vetclinic.playingball.model;

import java.time.DayOfWeek;
import java.time.LocalDate;

import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.WEDNESDAY;

public class Child {

    public Game goPlayBallOn(LocalDate someDay) {

        if (  someDay.getDayOfWeek().equals(SATURDAY)
           || someDay.getDayOfWeek().equals(DayOfWeek.SUNDAY))
        {
            return Game.Football;
        }

        if (someDay.getDayOfWeek().equals(WEDNESDAY)) {
            return Game.Tennis;
        }

        return Game.Handball;

    }
}

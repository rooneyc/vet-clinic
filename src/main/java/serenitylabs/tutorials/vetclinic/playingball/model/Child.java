package serenitylabs.tutorials.vetclinic.playingball.model;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Child {

    public Game goPlayBallOn(LocalDate someDay) {

        if (  someDay.getDayOfWeek().equals(DayOfWeek.SATURDAY)
           || someDay.getDayOfWeek().equals(DayOfWeek.SUNDAY))
        {
            return Game.Football;
        }
        return Game.Handball;

    }
}

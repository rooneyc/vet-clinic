package serenitylabs.tutorials.vetclinic.playingball.model;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SportsSchedule {

    GameSchedule schoolSportScheduled = new SchoolSportsSchedule();
    GameSchedule recreationalSportScheduled = new RecreationalSportsSchedule();

      public PlayBall forDate(LocalDate someDay) {
        if (someDay.getDayOfWeek() == DayOfWeek.WEDNESDAY) {
            return schoolSportScheduled.forGameOn(someDay);
        } else {
            return recreationalSportScheduled.forGameOn(someDay);
        }
    }
}

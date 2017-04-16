package serenitylabs.tutorials.vetclinic.playingball.model;

import java.time.Month;

public enum Season {
    SUMMER, WINTER;

    static public Season of ( Month month ) {

        switch ( month ) {

            // Spring.
            case MARCH:
                return Season.WINTER;

            case APRIL:
                return Season.WINTER;

            // Summer.
            case MAY:
                return Season.WINTER;

            case JUNE:
                return Season.SUMMER;

            case JULY:
                return Season.SUMMER;

            case AUGUST:
                return Season.SUMMER;

            // Fall.
            case SEPTEMBER:
                return Season.SUMMER;

            case OCTOBER:
                return Season.WINTER;

            // Winter.
            case NOVEMBER:
                return Season.WINTER;

            case DECEMBER:
                return Season.WINTER;

            case JANUARY:
                return Season.WINTER;

            case FEBRUARY:
                return Season.WINTER;

            default: throw new IllegalArgumentException("Invalid Month");
        }
    }

}
package serenitylabs.tutorials.vetclinic.playingball.model;

public class PlayFootball implements PlayBall {

    @Override
    public Game play() {
        return Game.Football;
    }
}

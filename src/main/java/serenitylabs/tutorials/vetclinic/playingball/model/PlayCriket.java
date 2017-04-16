package serenitylabs.tutorials.vetclinic.playingball.model;

public class PlayCriket implements PlayBall {

    @Override
    public Game play() {
        return Game.Cricket;
    }
}

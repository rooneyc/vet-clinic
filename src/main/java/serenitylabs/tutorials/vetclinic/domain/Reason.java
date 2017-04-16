package serenitylabs.tutorials.vetclinic.domain;

public class Reason {

    private String reason;

    Reason(String reason) {
        this.reason = reason;
    }

    boolean isPresent() {
        return true;
    }

    String get() {
        return reason;
    }
}

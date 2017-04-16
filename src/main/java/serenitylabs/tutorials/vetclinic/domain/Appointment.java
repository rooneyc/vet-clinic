package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Appointment {

    private final String petName;
    private final String owner;
    private final LocalDateTime appointmentTime;
    private Reason reason;

    public Appointment(String petName, String owner, LocalDateTime appointmentTime) {
        this.petName = petName;
        this.owner = owner;
        this.appointmentTime = appointmentTime;
    }

    public Appointment(String petName, String owner, LocalDateTime appointmentTime, Reason reason) {
        this.petName = petName;
        this.owner = owner;
        this.appointmentTime = appointmentTime;
        this.reason = reason;
    }

    String getPetName() {
        return petName;
    }

    String getOwner() {
        return owner;
    }

    LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    Reason getReason() {
        return reason;
    }

    static AppointmentBooker forPetCalled(String name) {
        return new AppointmentBooker(name);
    }

    static class AppointmentBooker {

        private String petName;
        private String owner;
        private Reason reason;

        AppointmentBooker(String petName) {
            this.petName = petName;
        }

        AppointmentBooker ownedBy(String owner) {
            this.owner = owner;
            return this;
        }

        AppointmentBooker because(String reason) {
            this.reason = new Reason(reason);
            return this;
        }

        Appointment at(LocalDateTime appointmentTime) {
            if (reason.isPresent()) {
                return new Appointment(petName, owner, appointmentTime, reason);
            }
            return new Appointment(petName, owner, appointmentTime);
        }
    }

}

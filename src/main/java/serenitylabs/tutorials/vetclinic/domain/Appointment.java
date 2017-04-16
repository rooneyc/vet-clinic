package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Appointment {

    private final String petName;
    private final String owner;
    private final LocalDateTime appointmentTime;

    public Appointment(String petName, String owner, LocalDateTime appointmentTime) {

        this.petName = petName;
        this.owner = owner;
        this.appointmentTime = appointmentTime;
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

    static AppointmentBooker forPetCalled(String name) {
        return new AppointmentBooker(name);
    }

    static class AppointmentBooker {

        private String petName;
        private String owner;

        AppointmentBooker(String petName) {
            this.petName = petName;
        }

        AppointmentBooker ownedBy(String owner) {
            this.owner = owner;
            return this;
        }

        Appointment at(LocalDateTime appointmentTime) {
            return new Appointment(petName, owner, appointmentTime);
        }
    }
}

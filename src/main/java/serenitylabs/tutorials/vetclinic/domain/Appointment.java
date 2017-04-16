package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;
import java.util.Optional;

class Appointment {

    private final String petName;
    private final String owner;
    private final LocalDateTime appointmentTime;
    private String reason;

    private Appointment(String petName, String owner, LocalDateTime appointmentTime, String reason) {

        this.petName = petName;
        this.owner = owner;
        this.appointmentTime = appointmentTime;
        this.reason = reason;
    }

    static AppointmentBooker forPetCalled(String name) {
        return new AppointmentBooker(name);
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

    Optional<String> getReason() {
        return Optional.ofNullable(reason);
    }

    static class AppointmentBooker {
        private String petName;
        private String owner;
        private String reason;

        AppointmentBooker(String petName) {
            this.petName = petName;
        }

        AppointmentBooker ownedBy(String owner) {
            this.owner = owner;
            return this;
        }

        AppointmentBooker because(String reason) {
            this.reason = reason;
            return this;
        }

        Appointment at(LocalDateTime appointmentTime) {
            return new Appointment(petName, owner, appointmentTime, reason);
        }
    }
}

package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenBookingAnAppointment {

    private static final LocalDateTime TODAY_AT_2_PM = LocalDateTime.now().withHour(2).withMinute(0);

    @Test
    public void an_appointment_has_a_patient_name_an_owner_and_a_date() {

        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

        assertThat(appointment.getPetName()).isEqualTo("Fido");
        assertThat(appointment.getOwner()).isEqualTo("Fred");
        assertThat(appointment.getAppointmentTime()).isEqualTo(TODAY_AT_2_PM);

    }

    @Test
    public void an_appointment_can_have_an_optional_reason() {

        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

        assertThat(appointment.getReason().isPresent()).isTrue();
        assertThat(appointment.getReason().get()).isEqualTo("He is sick");

    }

}

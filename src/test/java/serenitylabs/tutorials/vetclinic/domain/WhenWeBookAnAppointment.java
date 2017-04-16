package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
public class WhenWeBookAnAppointment {

    private static final LocalDateTime TODAY_AT_1_PM = LocalDateTime.now().withHour(1).withMinute(0);
    private static final LocalDateTime TODAY_AT_2_PM = LocalDateTime.now().withHour(2).withMinute(0);
    private static final LocalDateTime TODAY_AT_3_PM = LocalDateTime.now().withHour(3).withMinute(0);

    @Test
    public void an_appointment_has_a_patient_name_an_owner_and_a_date() {

        //When
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

        //Then
        Assert.assertEquals("Fido", appointment.getPetName());
        org.junit.Assert.assertThat(appointment.getPetName(), is(equalTo("Fido")));
        org.assertj.core.api.Assertions.assertThat(appointment.getPetName()).isEqualTo("Fido");

        Assert.assertEquals("Fred", appointment.getOwner());
        org.junit.Assert.assertThat(appointment.getOwner(), is(equalTo("Fred")));
        org.assertj.core.api.Assertions.assertThat(appointment.getOwner()).isEqualTo("Fred");

        Assert.assertEquals(TODAY_AT_2_PM, appointment.getAppointmentTime());
        org.junit.Assert.assertThat(appointment.getAppointmentTime(), is(equalTo(TODAY_AT_2_PM)));
        org.assertj.core.api.Assertions.assertThat(appointment.getAppointmentTime()).isEqualTo(TODAY_AT_2_PM);
    }

    @Test
    public void an_appointment_can_have_an_optional_reason() {

        //When
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

        //Then
        Assert.assertEquals(true, appointment.getReason().isPresent());
        org.junit.Assert.assertTrue(appointment.getReason().isPresent());
        org.assertj.core.api.Assertions.assertThat(appointment.getReason().isPresent()).isTrue();

        Assert.assertEquals("He is sick", appointment.getReason().get());
        org.junit.Assert.assertThat(appointment.getReason().get(), is(equalTo("He is sick")));
        org.assertj.core.api.Assertions.assertThat(appointment.getReason().get()).isEqualTo("He is sick");
    }

    @Test
    public void should_be_able_to_check_if_an_appointment_is_before_a_datetime() throws Exception {

        //When
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

        //Then
        org.junit.Assert.assertTrue(appointment.isBefore(TODAY_AT_3_PM));
        org.assertj.core.api.Assertions.assertThat(appointment.isBefore(TODAY_AT_3_PM)).isTrue();
    }

    @Test
    public void should_be_able_to_check_if_an_appointment_is_after_a_datetime() throws Exception {

        //When
        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").because("He is sick").at(TODAY_AT_2_PM);

        //Then
        org.junit.Assert.assertTrue(appointment.isAfter(TODAY_AT_1_PM));
        org.assertj.core.api.Assertions.assertThat(appointment.isAfter(TODAY_AT_1_PM)).isTrue();
    }

}

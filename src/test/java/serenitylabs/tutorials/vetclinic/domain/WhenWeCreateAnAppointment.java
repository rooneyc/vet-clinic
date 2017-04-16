package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenWeCreateAnAppointment {

    private static final LocalDateTime TODAY_AT_2_PM = LocalDateTime.now().withHour(2).withMinute(0);

    @Test
    public void an_appointment_has_a_patient_name_an_owner_and_a_date() {

        Appointment appointment = Appointment.forPetCalled("Fido").ownedBy("Fred").at(TODAY_AT_2_PM);

        Assert.assertEquals("Fido",appointment.getPetName());
        Assert.assertEquals("Fred",appointment.getOwner());
        Assert.assertEquals(TODAY_AT_2_PM,appointment.getAppointmentTime());
    }


}

package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

public class WhenCalculatingTotalPrices {

    @Test
    public void total_consultation_price_should_include_20_percent_tax() throws Exception {
        // GIVEN
        int netPrice = 100;

        // WHEN
        int totalPrice = TotalConsultationPrice.includingTax().forANetPriceOf(netPrice);

        // THEN
        Assert.assertEquals(120, totalPrice);

        org.junit.Assert.assertThat(totalPrice, equalTo(120));
        org.junit.Assert.assertThat(totalPrice, greaterThan(120));

        org.assertj.core.api.Assertions.assertThat(totalPrice).isEqualTo(120);
        org.assertj.core.api.Assertions.assertThat(totalPrice).isGreaterThan(120);
    }
}



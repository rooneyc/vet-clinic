package serenitylabs.tutorials.vetclinic.enumerations.katas;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import serenitylabs.tutorials.vetclinic.enumerations.colours.Colour;
import static serenitylabs.tutorials.vetclinic.enumerations.colours.Colour.*;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class WhenCalculatingWithColours {

    @Test
    public void should_know_about_all_the_main_colours() {
        assertThat(Colour.values()).contains(Red, Orange, Yellow, Green, Blue, Violet, Black, White);
    }

    @Test
    public void should_identify_primary_colours() {
        assertThat(Red.isPrimary()).isTrue();
        assertThat(Yellow.isPrimary()).isTrue();
        assertThat(Blue.isPrimary()).isTrue();
    }

    @Test
    public void should_identify_non_primary_colours() {
        assertThat(Orange.isPrimary()).isFalse();
        assertThat(Green.isPrimary()).isFalse();
        assertThat(Violet.isPrimary()).isFalse();
    }

    @Test
    public void black_and_white_are_not_considered_primary() {
        assertThat(Black.isPrimary()).isFalse();
        assertThat(White.isPrimary()).isFalse();
    }

    @Test
    public void red_is_the_opposite_of_green() {
        assertThat(Red.opposite()).isEqualTo(Green);
    }

    @Test
    public void blue_is_the_opposite_of_orange() {
        assertThat(Blue.opposite()).isEqualTo(Orange);
    }

    @Test
    public void yellow_is_the_opposite_of_violet() {
        assertThat(Yellow.opposite()).isEqualTo(Violet);
    }

    @Test
    public void black_is_the_opposite_of_white() {
        assertThat(Black.opposite()).isEqualTo(White);
    }

    @Test
    public void opposite_colours_are_symmetric() {
        assertThat(Red.opposite().opposite()).isEqualTo(Red);
        assertThat(Green.opposite().opposite()).isEqualTo(Green);
        assertThat(Blue.opposite().opposite()).isEqualTo(Blue);
        assertThat(Orange.opposite().opposite()).isEqualTo(Orange);
        assertThat(Violet.opposite().opposite()).isEqualTo(Violet);
        assertThat(Yellow.opposite().opposite()).isEqualTo(Yellow);
        assertThat(Black.opposite().opposite()).isEqualTo(Black);
        assertThat(White.opposite().opposite()).isEqualTo(White);
    }

    /**
     * This is an example of an alternative approach using JUnitParam
     */
    @Parameters({"Red,    Green",
            "Blue,   Orange",
            "Violet, Yellow",
            "Black,  White"})
    @Test
    public void should_identify_opposite_colours(Colour colour, Colour expectedOpposite) throws Exception {
        assertThat(colour.opposite()).isEqualTo(expectedOpposite);
    }

}

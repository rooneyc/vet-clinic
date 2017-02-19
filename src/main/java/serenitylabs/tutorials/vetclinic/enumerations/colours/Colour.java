package serenitylabs.tutorials.vetclinic.enumerations.colours;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Boolean.*;

public enum Colour {
    Red(TRUE),
    Orange(FALSE),
    Yellow(TRUE),
    Green(FALSE),
    Blue(TRUE),
    Violet(FALSE),
    Black(FALSE),
    White(FALSE);

    private static final Map<Colour, Colour> OPPOSITES = new HashMap<>();

    static {
        OPPOSITES.put(Red, Green);
        OPPOSITES.put(Green, Red);
        OPPOSITES.put(Blue, Orange);
        OPPOSITES.put(Orange, Blue);
        OPPOSITES.put(Violet, Yellow);
        OPPOSITES.put(Yellow, Violet);
        OPPOSITES.put(Black, White);
        OPPOSITES.put(White, Black);
    }

    private final Boolean primary;

    Colour(Boolean primary){
        this.primary = primary;
    }

    public boolean isPrimary() {
        return primary;
    }

    public Colour opposite() {
        return OPPOSITES.get(this);
    }
}


package org.example.Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class RhombusTest {

    @Test
    public void testAreaPositive() {
        Rhombus rhombus = new Rhombus(10, 5);
        assertEquals(25, rhombus.area(), 0.001, "Area should be correctly calculated.");
    }

    @Test
    public void testAreaLargeValues() {
        Rhombus rhombus = new Rhombus(10000, 5000);
        assertEquals(25000000, rhombus.area(), 0.001, "Area should be correctly calculated with large values.");
    }
}

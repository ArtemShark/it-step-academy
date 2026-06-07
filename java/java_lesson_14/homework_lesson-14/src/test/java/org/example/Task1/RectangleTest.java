package org.example.Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testAreaPositive() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(50, rectangle.area(), 0.001, "Area should be correctly calculated.");
    }

    @Test
    public void testAreaLargeValues() {
        Rectangle rectangle = new Rectangle(10000, 5000);
        assertEquals(50000000, rectangle.area(), 0.001, "Area should be correctly calculated with large values.");
    }

}


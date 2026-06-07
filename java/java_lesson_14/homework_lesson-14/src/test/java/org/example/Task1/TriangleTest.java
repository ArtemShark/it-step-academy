package org.example.Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TriangleTest {

    @Test
    public void testAreaPositive() {
        Triangle triangle = new Triangle(10, 5);
        assertEquals(25.0, triangle.area(), 0.001, "Area should be correctly calculated.");
    }

    @Test
    public void testAreaLargeValues() {
        Triangle triangle = new Triangle(10000, 5000);
        assertEquals(25000000, triangle.area(), 0.001,"Area should be correctly calculated with large values.");
    }
}

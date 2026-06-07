package org.example.Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void testAreaPositive() {
        Square square = new Square(10);
        assertEquals(100, square.area(), 0.001, "Area should be correctly calculated.");
    }

    @Test
    public void testAreaLargeValues() {
        Square square = new Square(10000);
        assertEquals(100000000, square.area(), 0.001, "Area should be correctly calculated with large values.");
    }
}

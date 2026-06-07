package org.example.Task4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LengthConverterTest {

    @Test
    void testConversion() {
        assertEquals(1000, LengthConverter.convert(1, "m", "mm"), 0.001);
        assertEquals(100, LengthConverter.convert(1, "m", "cm"), 0.001);
        assertEquals(10, LengthConverter.convert(1, "m", "dm"), 0.001);
        assertEquals(0.001, LengthConverter.convert(1, "m", "km"), 0.001);

        assertEquals(1, LengthConverter.convert(1000, "mm", "m"), 0.001);
        assertEquals(1, LengthConverter.convert(100, "cm", "m"), 0.001);
        assertEquals(1, LengthConverter.convert(10, "dm", "m"), 0.001);
        assertEquals(1, LengthConverter.convert(0.001, "km", "m"), 0.001);

        assertEquals(100000, LengthConverter.convert(1, "km", "cm"), 0.001);
        assertEquals(0.1, LengthConverter.convert(10, "cm", "m"), 0.001);
    }
}

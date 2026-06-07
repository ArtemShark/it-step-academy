package org.example.Task5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WeightConverterTest {

    @Test
    void testConversion() {
        assertEquals(1_000_000, WeightConverter.convert(1, "kg", "mg"), 0.001);
        assertEquals(1_000, WeightConverter.convert(1, "kg", "g"), 0.001);
        assertEquals(10, WeightConverter.convert(1, "ton", "centner"), 0.001);
        assertEquals(1_000, WeightConverter.convert(1, "ton", "kg"), 0.001);
        assertEquals(1, WeightConverter.convert(10, "centner", "ton"), 0.001);
        assertEquals(1, WeightConverter.convert(1_000_000, "mg", "kg"), 0.001);
        assertEquals(1, WeightConverter.convert(1000, "g", "kg"), 0.001);
        assertEquals(1, WeightConverter.convert(1, "kg", "kg"), 0.001);
    }
}

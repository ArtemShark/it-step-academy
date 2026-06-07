package org.example.Task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyConverterTest {

    private final CurrencyConverter converter = new CurrencyConverter();
    private static final double DELTA = 0.01;
    private static final double EUR_TO_USD_RATE = 1.13;
    private static final double GBP_TO_USD_RATE = 1.35;
    private static final double JPY_TO_USD_RATE = 0.0091;

    @Test
    public void testConversionUSDToOthers() {
        assertEquals(100 / EUR_TO_USD_RATE, converter.convert(100, "USD", "EUR"), DELTA);
        assertEquals(100 / GBP_TO_USD_RATE, converter.convert(100, "USD", "GBP"), DELTA);
        assertEquals(100 / JPY_TO_USD_RATE, converter.convert(100, "USD", "JPY"), DELTA);
    }

    @Test
    public void testConversionEURToOthers() {
        assertEquals(100 * EUR_TO_USD_RATE, converter.convert(100, "EUR", "USD"), DELTA);
        assertEquals((100 * EUR_TO_USD_RATE) / GBP_TO_USD_RATE, converter.convert(100, "EUR", "GBP"), DELTA);
        assertEquals((100 * EUR_TO_USD_RATE) / JPY_TO_USD_RATE, converter.convert(100, "EUR", "JPY"), DELTA);
    }

    @Test
    public void testConversionGBPToOthers() {
        assertEquals(100 * GBP_TO_USD_RATE, converter.convert(100, "GBP", "USD"), DELTA);
        assertEquals((100 * GBP_TO_USD_RATE) / EUR_TO_USD_RATE, converter.convert(100, "GBP", "EUR"), DELTA);
        assertEquals((100 * GBP_TO_USD_RATE) / JPY_TO_USD_RATE, converter.convert(100, "GBP", "JPY"), DELTA);
    }

    @Test
    public void testConversionJPYToOthers() {
        assertEquals(100 * JPY_TO_USD_RATE, converter.convert(100, "JPY", "USD"), DELTA);
        assertEquals((100 * JPY_TO_USD_RATE) / EUR_TO_USD_RATE, converter.convert(100, "JPY", "EUR"), DELTA);
        assertEquals((100 * JPY_TO_USD_RATE) / GBP_TO_USD_RATE, converter.convert(100, "JPY", "GBP"), DELTA);
    }

    @Test
    public void testSelfConversion() {
        assertEquals(100, converter.convert(100, "USD", "USD"), DELTA);
        assertEquals(100, converter.convert(100, "EUR", "EUR"), DELTA);
        assertEquals(100, converter.convert(100, "GBP", "GBP"), DELTA);
        assertEquals(100, converter.convert(100, "JPY", "JPY"), DELTA);
    }
}

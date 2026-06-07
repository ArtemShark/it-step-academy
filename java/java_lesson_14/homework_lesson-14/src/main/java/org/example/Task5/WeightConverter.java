package org.example.Task5;

public class WeightConverter {

    public static double convert(double value, String fromUnit, String toUnit) {
        double kilograms = convertToKilograms(value, fromUnit);
        return convertFromKilograms(kilograms, toUnit);
    }

    private static double convertToKilograms(double value, String unit) {
        return switch (unit) {
            case "mg" -> value / 1_000_000;
            case "g" -> value / 1_000;
            case "kg" -> value;
            case "centner" -> value * 100;
            case "ton" -> value * 1_000;
            default -> throw new IllegalArgumentException("Неизвестная единица измерения: " + unit);
        };
    }

    private static double convertFromKilograms(double value, String unit) {
        return switch (unit) {
            case "mg" -> value * 1_000_000;
            case "g" -> value * 1_000;
            case "kg" -> value;
            case "centner" -> value / 100;
            case "ton" -> value / 1_000;
            default -> throw new IllegalArgumentException("Неизвестная единица измерения: " + unit);
        };
    }
}

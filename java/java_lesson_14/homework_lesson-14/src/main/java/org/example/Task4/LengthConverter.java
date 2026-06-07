package org.example.Task4;

public class LengthConverter {

    public static double convert(double value, String fromUnit, String toUnit) {
        double meters = convertToMeters(value, fromUnit);
        return convertFromMeters(meters, toUnit);
    }

    private static double convertToMeters(double value, String unit) {
        return switch (unit) {
            case "mm" -> value / 1000;
            case "cm" -> value / 100;
            case "dm" -> value / 10;
            case "m" -> value;
            case "km" -> value * 1000;
            default -> throw new IllegalArgumentException("Неизвестная единица измерения: " + unit);
        };
    }

    private static double convertFromMeters(double value, String unit) {
        return switch (unit) {
            case "mm" -> value * 1000;
            case "cm" -> value * 100;
            case "dm" -> value * 10;
            case "m" -> value;
            case "km" -> value / 1000;
            default -> throw new IllegalArgumentException("Неизвестная единица измерения: " + unit);
        };
    }
}


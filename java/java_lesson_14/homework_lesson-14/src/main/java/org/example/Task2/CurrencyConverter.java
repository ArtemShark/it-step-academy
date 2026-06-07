package org.example.Task2;

public class CurrencyConverter {
    private static final double EUR_TO_USD_RATE = 1.13;
    private static final double GBP_TO_USD_RATE = 1.35;
    private static final double JPY_TO_USD_RATE = 0.0091;

    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (fromCurrency.equals(toCurrency)) {
            return amount;
        }

        double amountInUsd = switch (fromCurrency) {
            case "EUR" -> amount * EUR_TO_USD_RATE;
            case "GBP" -> amount * GBP_TO_USD_RATE;
            case "JPY" -> amount * JPY_TO_USD_RATE;
            default -> amount;
        };

        return switch (toCurrency) {
            case "EUR" -> amountInUsd / EUR_TO_USD_RATE;
            case "GBP" -> amountInUsd / GBP_TO_USD_RATE;
            case "JPY" -> amountInUsd / JPY_TO_USD_RATE;
            default -> amountInUsd;
        };
    }
}

package com.company;
import java.util.Locale;
import java.util.Scanner;

import com.company.models.DeviceManager;
import com.company.models.Device;
public class MainTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        DeviceManager manager = new DeviceManager();

        manager.addDevice(new Device("Smartphone", 2022, 999.99, "Black", "Mobile"));
        manager.addDevice(new Device("Laptop", 2023, 1499.99, "Silver", "Computer"));
        manager.addDevice(new Device("Tablet", 2024, 799.99, "White", "Mobile"));
        manager.addDevice(new Device("Smartwatch", 2022, 299.99, "Black", "Wearable"));

        System.out.println("All devices:");
        manager.showAllDevices();

        System.out.print("\nEnter color: ");
        String colorInput = scanner.nextLine();

        System.out.println("\nDevices of color " + colorInput + ":");
        manager.getDevicesByColor(colorInput).forEach(System.out::println);

        System.out.println();
        System.out.print("Enter year: ");
        int yearInput = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDevices of year " + yearInput + ":");
        manager.getDevicesByYear(yearInput).forEach(System.out::println);

        System.out.println();
        System.out.print("Enter price: ");
        double priceInput = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nDevices more expensive than $" + priceInput + ":");
        manager.getDevicesMoreExpensiveThan(priceInput).forEach(System.out::println);

        System.out.println();
        System.out.print("Enter type: ");
        String typeInput = scanner.nextLine();

        System.out.println("\n" + typeInput + " devices:");
        manager.getDevicesByType(typeInput).forEach(System.out::println);

        System.out.println();
        System.out.print("Enter start year of range: ");
        int startYearInput = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter end year of range: ");
        int endYearInput = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nDevices with year between " + startYearInput + " and " + endYearInput + ":");
        manager.getDevicesByYearRange(startYearInput, endYearInput).forEach(System.out::println);

        scanner.close();
    }
}

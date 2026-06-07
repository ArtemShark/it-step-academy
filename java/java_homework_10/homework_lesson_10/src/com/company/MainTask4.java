package com.company;

import com.company.models.Projector;
import com.company.models.ProjectorManager;
public class MainTask4 {
    public static void main(String[] args) {
        ProjectorManager manager = new ProjectorManager();

        manager.addProjector(new Projector("Epson 123", 2024, 799.99, "Epson"));
        manager.addProjector(new Projector("Sony XYZ", 2022, 1499.99, "Sony"));
        manager.addProjector(new Projector("Optoma ABC", 2021, 999.99, "Optoma"));
        manager.addProjector(new Projector("LG QWE", 2023, 1299.99, "LG"));

        System.out.println("All projectors:");
        manager.showAllProjectors();

        System.out.println("\nProjectors by manufacturer Sony:");
        manager.showProjectorsByManufacturer("Sony");

        int currentYear = 2024;
        System.out.println("\nProjectors of current year:");
        manager.showProjectorsOfCurrentYear(currentYear);

        double specifiedPrice = 1000;
        System.out.println("\nProjectors more expensive than $" + specifiedPrice + ":");
        manager.showProjectorsMoreExpensiveThan(specifiedPrice);

        System.out.println("\nProjectors sorted by price ascending:");
        manager.showProjectorsSortedByPriceAscending();

        System.out.println("\nProjectors sorted by price descending:");
        manager.showProjectorsSortedByPriceDescending();

        System.out.println("\nProjectors sorted by year ascending:");
        manager.showProjectorsSortedByYearAscending();

        System.out.println("\nProjectors sorted by year descending:");
        manager.showProjectorsSortedByYearDescending();
    }
}
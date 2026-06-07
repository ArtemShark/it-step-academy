package com.company.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProjectorManager {
    private List<Projector> projectors;

    public ProjectorManager() {
        this.projectors = new ArrayList<>();
    }

    public void addProjector(Projector projector) {
        projectors.add(projector);
    }

    public void showAllProjectors() {
        projectors.forEach(System.out::println);
    }

    public void showProjectorsByManufacturer(String manufacturer) {
        projectors.stream()
                .filter(projector -> projector.getManufacturer().equalsIgnoreCase(manufacturer))
                .forEach(System.out::println);
    }

    public void showProjectorsOfCurrentYear(int currentYear) {
        projectors.stream()
                .filter(projector -> projector.getYear() == currentYear)
                .forEach(System.out::println);
    }

    public void showProjectorsMoreExpensiveThan(double price) {
        projectors.stream()
                .filter(projector -> projector.getPrice() > price)
                .forEach(System.out::println);
    }

    public void showProjectorsSortedByPriceAscending() {
        projectors.stream()
                .sorted(Comparator.comparingDouble(Projector::getPrice))
                .forEach(System.out::println);
    }

    public void showProjectorsSortedByPriceDescending() {
        projectors.stream()
                .sorted(Comparator.comparingDouble(Projector::getPrice).reversed())
                .forEach(System.out::println);
    }

    public void showProjectorsSortedByYearAscending() {
        projectors.stream()
                .sorted(Comparator.comparingInt(Projector::getYear))
                .forEach(System.out::println);
    }

    public void showProjectorsSortedByYearDescending() {
        projectors.stream()
                .sorted(Comparator.comparingInt(Projector::getYear).reversed())
                .forEach(System.out::println);
    }
}
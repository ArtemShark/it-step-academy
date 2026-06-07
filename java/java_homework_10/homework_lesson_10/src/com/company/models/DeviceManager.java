package com.company.models;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class DeviceManager {
    private List<Device> devices;

    public DeviceManager() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void showAllDevices() {
        devices.forEach(System.out::println);
    }

    public List<Device> getDevicesByColor(String color) {
        return devices.stream()
                .filter(device -> device.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

    public List<Device> getDevicesByYear(int year) {
        return devices.stream()
                .filter(device -> device.getYear() == year)
                .collect(Collectors.toList());
    }

    public List<Device> getDevicesMoreExpensiveThan(double price) {
        return devices.stream()
                .filter(device -> device.getPrice() > price)
                .collect(Collectors.toList());
    }

    public List<Device> getDevicesByType(String type) {
        return devices.stream()
                .filter(device -> device.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    public List<Device> getDevicesByYearRange(int startYear, int endYear) {
        return devices.stream()
                .filter(device -> device.getYear() >= startYear && device.getYear() <= endYear)
                .collect(Collectors.toList());
    }
}

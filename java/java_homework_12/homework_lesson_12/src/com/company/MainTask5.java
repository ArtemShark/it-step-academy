package com.company;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.company.task5.Corporation;
import com.company.task5.FileManager;
import com.company.task5.Employee;

public class MainTask5 {
    private static final Corporation corporation = new Corporation();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the file path to load employees:");
        String filePath = scanner.nextLine();
        try {
            List<Employee> loadedEmployees = FileManager.loadEmployeesFromFile(filePath);
            loadedEmployees.forEach(corporation::addEmployee);
            System.out.println("Employees loaded successfully.");
        } catch (IOException e) {
            System.out.println("Failed to load employees from file. Starting with an empty list.");
        }


        boolean running = true;
        while (running) {
            System.out.println("\nAvailable commands:");
            System.out.println("1 - Add employee");
            System.out.println("2 - Edit employee");
            System.out.println("3 - Remove employee");
            System.out.println("4 - Find employee by last name");
            System.out.println("5 - Show employees by age or starting letter");
            System.out.println("6 - Save employees to file");
            System.out.println("0 - Exit");
            System.out.print("Enter command: ");
            int command = scanner.nextInt();
            scanner.nextLine();

            switch (command) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    editEmployee();
                    break;
                case 3:
                    removeEmployee();
                    break;
                case 4:
                    findEmployeeByLastName();
                    break;
                case 5:
                    showEmployeesByCriteria();
                    break;
                case 6:
                    saveEmployeesToFile(filePath);
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid command.");
                    break;
            }
        }

        saveEmployeesToFile(filePath);
        System.out.println("Exiting program. Goodbye!");
    }

    private static void addEmployee() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Employee employee = new Employee(name, lastName, age);
        corporation.addEmployee(employee);
        System.out.println("Employee added successfully.");
    }

    private static void editEmployee() {
        System.out.print("Enter the last name of the employee to edit: ");
        String lastName = scanner.nextLine();
        Employee employee = corporation.findEmployeeByLastName(lastName);
        if (employee == null) {
            System.out.println("Employee not found.");
            return;
        }

        System.out.print("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new last name: ");
        String newLastName = scanner.nextLine();
        System.out.print("Enter new age: ");
        int newAge = scanner.nextInt();
        scanner.nextLine();

        Employee updatedEmployee = new Employee(newName, newLastName, newAge);
        corporation.editEmployee(lastName, updatedEmployee);
        System.out.println("Employee updated successfully.");
    }

    private static void removeEmployee() {
        System.out.print("Enter the last name of the employee to remove: ");
        String lastName = scanner.nextLine();
        corporation.removeEmployee(lastName);
        System.out.println("Employee removed successfully.");
    }

    private static void findEmployeeByLastName() {
        System.out.print("Enter the last name of the employee to find: ");
        String lastName = scanner.nextLine();
        Employee employee = corporation.findEmployeeByLastName(lastName);
        if (employee != null) {
            System.out.println("Found employee: " + employee);
        } else {
            System.out.println("Employee not found.");
        }
    }

    private static void showEmployeesByCriteria() {
        System.out.print("Enter age or 0 to skip: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter starting letter or press Enter to skip: ");
        String input = scanner.nextLine();
        char startsWithLetter = input.isEmpty() ? '\0' : input.charAt(0);

        List<Employee> employees = corporation.findEmployeesByCriteria(age, startsWithLetter);
        if (!employees.isEmpty()) {
            employees.forEach(System.out::println);
        } else {
            System.out.println("No employees found matching criteria.");
        }
    }

    private static void saveEmployeesToFile(String filePath) {
        try {
            FileManager.saveEmployeesToFile(filePath, corporation.getAllEmployees());
            System.out.println("Employees saved successfully.");
        } catch (IOException e) {
            System.out.println("Failed to save employees.");
        }
    }
}

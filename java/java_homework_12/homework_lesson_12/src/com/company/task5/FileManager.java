package com.company.task5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    public static void saveEmployeesToFile(String filePath, List<Employee> employees) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Employee employee : employees) {
                bw.write(employee.getName() + "," + employee.getLastName() + "," + employee.getAge());
                bw.newLine();
            }
        }
    }

    public static List<Employee> loadEmployeesFromFile(String filePath) throws IOException {
        List<Employee> employees = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    String lastName = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    employees.add(new Employee(name, lastName, age));
                }
            }
        }
        return employees;
    }
}

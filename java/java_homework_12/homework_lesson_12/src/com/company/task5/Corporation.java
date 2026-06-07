package com.company.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Corporation {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void editEmployee(String lastName, Employee updatedEmployee) {
        for (Employee employee : employees) {
            if (employee.getLastName().equals(lastName)) {
                employee.setName(updatedEmployee.getName());
                employee.setLastName(updatedEmployee.getLastName());
                employee.setAge(updatedEmployee.getAge());
                return;
            }
        }
    }

    public void removeEmployee(String lastName) {
        employees.removeIf(employee -> employee.getLastName().equals(lastName));
    }

    public Employee findEmployeeByLastName(String lastName) {
        return employees.stream()
                .filter(employee -> employee.getLastName().equals(lastName))
                .findFirst()
                .orElse(null);
    }

    public List<Employee> findEmployeesByCriteria(int age, char startsWithLetter) {
        return employees.stream()
                .filter(employee -> employee.getAge() == age || employee.getLastName().startsWith(String.valueOf(startsWithLetter)))
                .collect(Collectors.toList());
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }
}

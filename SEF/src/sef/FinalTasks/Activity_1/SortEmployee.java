package sef.FinalTasks.Activity_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmployee {
    public static void main(String[] args) {

        // Sort by name and surname

        Employee employee1 = new Employee("John", "Doe", 28);
        Employee employee2 = new Employee("Alex", "Anderson", 28);
        Employee employee3 = new Employee("Michael", "Zero", 28);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        employeeList.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSurname));
        for (Employee employee:
             employeeList) {
            System.out.println(employee);
        }
    }
}

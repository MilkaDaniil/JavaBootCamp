package sef.FinalTasks.Activity_1;

import java.util.*;

public class FirstActivity {
    public static void main(String[] args) {

        Employee john  = new Employee("John", 21, "QA", "Accenture", 1000);
        Employee mary = new Employee("Mary", 22, "QA", "Accenture", 1500);
        Employee oskar = new Employee("Oskar", 23, "QA", "Accenture", 2000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(john);
        employeeList.add(mary);
        employeeList.add(oskar);

        employeeList.forEach(Employee::introducePerson);

        employeeList.sort(Comparator.comparingInt(Employee::getSalary).reversed());

        for(Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
package sef.FinalTasks.Activity_1;

import java.util.ArrayList;
import java.util.List;

import static sef.FinalTasks.Activity_1.Employee.writeEmployeeToTheFile;

public class WriteEmployeeToTheFile {
    public static void main(String[] args) {

        Employee employee1 = new Employee("John", 20, "QA", "Accenture", 1000);
        Employee employee2 = new Employee("Mary", 20, "QA", "Accenture", 1000);
        Employee employee3 = new Employee("Andrew", 20, "QA", "Accenture", 1000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        writeEmployeeToTheFile(employeeList);
    }
}

package src;

import src.dao.TempDB;
import src.entity.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques3 {

    public static void main(String[] args) {

//        Q3. Group Employees by Department
//        Group a list of employees by their department.
//
//        class Employee {
//            String name;
//            String department;
//        }

        List<Employee> employeeList = TempDB.getEmployees();

        Map<String, List<Employee>> groupedEmployees = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        System.out.println(groupedEmployees);
    }
}

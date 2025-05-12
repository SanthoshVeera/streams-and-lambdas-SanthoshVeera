package src;

import src.dao.TempDB;
import src.entity.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class Ques10 {
    public static void main(String[] args) {
//        Q10. Sort Employees by Salary (Descending)
//                Return the list of employees sorted by salary in descending order.

        List<Employee> employees = TempDB.getEmployees();

        List<Employee> sortedEmployee = employees.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .collect(Collectors.toList());

        System.out.println(sortedEmployee);

    }
}

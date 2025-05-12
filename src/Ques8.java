package src;

import src.dao.TempDB;
import src.entity.Employee;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Ques8 {
    public static void main(String[] args) {

//        Q8. Average Salary by Department
//        Return a map of department → average salary.

        List<Employee> employees =TempDB.getEmployees();

        Map<String, Double> salariesMap =employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDept(),
                                                Collectors.mapping(x -> x.getSalary(),
                                                        Collectors.averagingDouble(x -> x))));

        System.out.println(salariesMap);

    }
}

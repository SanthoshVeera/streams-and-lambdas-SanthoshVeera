package src;

import src.dao.TempDB;
import src.entity.Employee;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args) {

//        Q9. Top 3 Salaries
//        Return the names of the top 3 highest-paid employees.

        List<Employee> employees = TempDB.getEmployees();

        List<Object> Top3 = employees.stream()
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .limit(3)
                .collect(Collectors.mapping(x -> x.getName(),Collectors.toList()));

        System.out.println(Top3);

    }
}

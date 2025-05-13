package src;

import src.dao.TempDB;
import src.entity.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques11 {
    public static void main(String[] args) {

//        Q11. Departments with No Employees
//        Given a list of departments and a list of employees, return the names of departments with no employees assigned.

        List<Employee> employees = TempDB.getEmployees();

        //employees.add(new )

        List<String> emptyDepts = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept))
                .entrySet()
                .stream()
                .filter(x -> x.getValue().isEmpty())
                .map(Map.Entry::getKey)
                .toList();

        //System.out.println(emptyDepts);

        System.out.println("----------------------");


        //Ganesh Approach
        employees.stream()
                .filter(emp->emp.getName().isEmpty() && !emp.getDept().isEmpty())
                .map(Employee::getDept)
                .distinct()
                .toList()
                .forEach(System.out::println);


    }
}

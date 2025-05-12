package src;

import src.dao.TempDB;
import src.entity.Employee;

import java.util.List;
import java.util.Optional;

public class Ques4 {
    public static void main(String[] args) throws Exception {

//        Q4. Employee with Max Salary
//        Find the employee with the highest salary from the list.

        List<Employee> employeeList = TempDB.getEmployees();

        Optional<Employee> HighestPaidEmployee01 = employeeList.stream()
                .max((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()));


        if(HighestPaidEmployee01.isPresent())
            System.out.println(HighestPaidEmployee01.get());


        // orElseThrow accepts a Supplier FI, no input arguments no return value

        Employee HighestPaidEmployee02 = employeeList.stream()
                .max((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .orElseThrow(() ->  new Exception("No Employee"));

        System.out.println(HighestPaidEmployee02);



        // orElse provide other employee object.
        Employee HighestPaidEmployee03 = employeeList.stream()
                .max((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .orElse(null);


        if(HighestPaidEmployee03 != null)
            System.out.println(HighestPaidEmployee03);
    }
}

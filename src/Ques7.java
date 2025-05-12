package src;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ques7 {
    public static void main(String[] args) {

//        Q7. Partition Employees by Experience
//        Given a list of employees, partition them into two groups:
//
//        Experience >= 5 years
//        Experience < 5 years

        Map<Boolean, List<String>> mymap = Arrays.asList(
                new Employee2("santhosh", 4),
                new Employee2("Teja", 6),
                new Employee2("Ganesh", 5),
                new Employee2("Eshwar", 2),
                new Employee2("Rohit", 10),
                new Employee2("Dileep", 45),
                new Employee2("Pradeep", 40)
                ).stream()
                .collect(Collectors.partitioningBy(e -> e.experience >= 5,
                                                    Collectors.mapping(x -> x.name, Collectors.toList())));


        System.out.println(mymap);

    }
}

class Employee2 {
    String name;
    int experience;

    public Employee2(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
package src.dao;

import src.entity.Employee;
import src.entity.Gender;
import src.entity.Project;

import java.util.*;

public class TempDB {

    public static List<Employee> getEmployees() {

        List<Project> projects = getProjects();

        // Departments and names pool
        String[] departments = {"IT", "HR", "Finance", "Marketing", "Operations"};
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Ethan",
                "Fiona", "George", "Hannah", "Ian", "Jasmine",
                "Kevin", "Laura", "Mike", "Nina", "Oliver",
                "Paula", "Quentin", "Rachel", "Steve", "Tina"};

        List<Employee> employeeList = new ArrayList<>();

        Random random = new Random();

        for(int i=0; i< names.length; i++) {
            String name = names[i];

            // randomly assigning a department
            String dept = departments[random.nextInt(departments.length)];

            double salary = 50000 + Math.random() * 1000000;

            Collections.shuffle(projects);
            List<Project> assignedProjects = projects.subList(0, 1 + random.nextInt(3));

            Gender gender = random.nextBoolean() ? Gender.MALE : Gender.FEMALE;

            employeeList.add(new Employee(name, dept, assignedProjects, salary, gender));

        }
        return employeeList;
    }

    public static List<Project> getProjects() {
        return Arrays.asList(
                new Project("P001", "Apollo CRM", "Acme Corp", "John Doe"),
                new Project("P002", "Orion ERP", "Globex Ltd", "Jane Smith"),
                new Project("P003", "Helios Analytics", "Initech", "Albert Wong"),
                new Project("P004", "Zephyr Mobile", "Umbrella Corp", "Maria Garcia"),
                new Project("P005", "Nova Cloud", "Soylent Corp", "David Lee")
        );
    }
}


//lass Employee {
//String name;
//String dept;
//List<Project> projects;
//double salary;
//Gender gender;
//
//public Employee(String name, String dept, List<Project> projects, double salary, Gender gender) {
//    this.name = name;
//    this.dept = dept;
//    this.projects = projects;
//    this.salary = salary;
//    this.gender = gender;
//}
//
//@Override
//public String toString() {
//    return "Employee{" +
//            "name='" + name + '\'' +
//            ", dept='" + dept + '\'' +
//            ", projects=" + projects +
//            ", salary=" + salary +
//            ", gender=" + gender +
//            '}';
//}
//}
//
//class Project {
//    String projectID;
//    String name;
//    String client;
//    String BULeadName;
//
//    public Project(String projectID, String name, String client, String BULeadName) {
//        this.projectID = projectID;
//        this.name = name;
//        this.client = client;
//        this.BULeadName = BULeadName;
//    }
//
//    @Override
//    public String toString() {
//        return "Project{" +
//                "projectID='" + projectID + '\'' +
//                ", name='" + name + '\'' +
//                ", client='" + client + '\'' +
//                ", BULeadName='" + BULeadName + '\'' +
//                '}';
//    }
//}
//
//enum Gender {
//    MALE,
//    FEMALE
//}c
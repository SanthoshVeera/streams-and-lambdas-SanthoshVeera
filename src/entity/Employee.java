package src.entity;

import java.util.List;
import java.util.Objects;

public class Employee {
    private String name;
    private String dept;
    private List<Project> projects;
    private double salary;
    private Gender gender;

    public Employee(String name, String dept, List<Project> projects, double salary, Gender gender) {
        this.name = name;
        this.dept = dept;
        this.projects = projects;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept) && Objects.equals(projects, employee.projects) && gender == employee.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dept, projects, salary, gender);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", projects=" + projects +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}

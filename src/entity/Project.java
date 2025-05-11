package src.entity;

import java.util.Objects;

public class Project {
    String projectID;
    String name;
    String client;
    String BULeadName;

    public Project(String projectID, String name, String client, String BULeadName) {
        this.projectID = projectID;
        this.name = name;
        this.client = client;
        this.BULeadName = BULeadName;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getBULeadName() {
        return BULeadName;
    }

    public void setBULeadName(String BULeadName) {
        this.BULeadName = BULeadName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(projectID, project.projectID) && Objects.equals(name, project.name) && Objects.equals(client, project.client) && Objects.equals(BULeadName, project.BULeadName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectID, name, client, BULeadName);
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectID='" + projectID + '\'' +
                ", name='" + name + '\'' +
                ", client='" + client + '\'' +
                ", BULeadName='" + BULeadName + '\'' +
                '}';
    }
}

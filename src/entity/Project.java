package src.entity;

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
    public String toString() {
        return "Project{" +
                "projectID='" + projectID + '\'' +
                ", name='" + name + '\'' +
                ", client='" + client + '\'' +
                ", BULeadName='" + BULeadName + '\'' +
                '}';
    }
}

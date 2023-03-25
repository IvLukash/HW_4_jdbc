package goit.education.all_queries;
public class MaxProjectCountClient {
    private String name;
    private int projectCount;

    @Override
    public String toString() {
        return "{" + "name: " + name  +
                ", projectCount: " + projectCount +
                "}";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }
}

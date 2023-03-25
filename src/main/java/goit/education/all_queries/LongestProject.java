package goit.education.all_queries;

public class LongestProject {
    private String name;
    private int monthCount;

    @Override
    public String toString() {
        return "{" + "name: " + name  +
                ", monthCount: " + monthCount +
                "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }
}

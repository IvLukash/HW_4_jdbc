package goit.education.all_queries;

public class MaxSalaryWorker {
    private String name;
    private int salary;

    @Override
    public String toString() {
        return "{" + "name: " + name  +
                ", salary: " + salary +
                "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

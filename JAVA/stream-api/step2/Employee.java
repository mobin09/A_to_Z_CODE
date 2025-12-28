import java.util.List;

public class Employee {
    private String name;
    private Integer salary;
    private String department;
    private List<String> skills;

    public Employee(String name, Integer salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Employee(String name, Integer salary, String department, List<String> skills){
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.skills = skills;
    }


    public String getName() {
        return name;
    }
    
    public Integer getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public List<String> getSkills(){
        return skills;
    }
}

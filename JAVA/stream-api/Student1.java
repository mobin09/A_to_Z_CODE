public class Student1 {
    private String branch;
    private Integer age;
    private String name;
    
    public Student1(String branch, Integer age, String name){
        this.branch = branch;
        this.age = age;
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class Employee {
    String name;
    Integer age;

    public Employee(String name, Integer age){
        this.name = name;
        this.age = age;
    }

   public String getName(){
    return name;
   }

   public Integer getAge(){
    return age;
   }

    public String toString(){
        return "Name: " + this.name + ", age: "+ this.age;
    }

}

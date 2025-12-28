public class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student s){
      return this.age - s.age;
    }

    public String toString(){
        return this.age + " : " + this.name;
    }
}

import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;
    public Professor(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}

class Department {
    private String deptName;   
    private List<Professor> listProfessor = new ArrayList<>();
    
    public Department(String deptName, List<Professor> listProfessors){
        this.deptName = deptName;
        this.listProfessor = listProfessors;
    }

    public void printProfessors(){
        System.out.println("Department of " +  deptName);
        for(Professor prof: listProfessor){
            System.out.println("-" + prof.getName());
        }
    }

}


class Demo {
    public static void main(String[] args) {
        Professor p1 = new Professor("Mobin Arshad");
        Professor p2 = new Professor("Mohit Kumar");
        List<Professor> list = List.of(p1,p2);
        Department dept = new Department("Computer Science", list);
        dept.printProfessors();
        /*
        Department of Computer Science
        -Mobin Arshad
        -Mohit Kumar
        */
    }
}



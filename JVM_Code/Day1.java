import java.lang.reflect.Method;
import java.util.Arrays;

class Student {
    public String getName(){
        return null;
    }

    public int getMarks(){
        return 10;
    }
}


public class Day1 {
    public static void main(String[] args) throws ClassNotFoundException {
      Class cl =   Class.forName("Student");
     Method[] m = cl.getDeclaredMethods();
     Arrays.stream(m).forEach( x-> System.out.println(x.getName()));
     System.out.println("Number of methods is::" + m.length);

     Class cl2=  Class.forName("java.lang.String");
     Method[] m2 = cl2.getDeclaredMethods();
     Arrays.stream(m2).forEach(x-> System.out.println(x.getName()));
     System.out.println("Total Methods in the String is::" + m2.length);

     Student s1 = new Student();
     Class c1 = s1.getClass();

     Student s2 = new Student();
     Class c2 = s2.getClass();

     System.out.println(c1.hashCode() + ":" + c2.hashCode());
     System.out.println(c1 == c2);


    }

}
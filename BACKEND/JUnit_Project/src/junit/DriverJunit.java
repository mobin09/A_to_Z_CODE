package junit;

public class DriverJunit {
      public static void main(String[] args) {
    	  int[] arr = {20,40,50,60};
    	  
    	  MyMath m = new MyMath();
    	 long l = m.getValue(arr);
    	 System.out.println(l);
      }
}

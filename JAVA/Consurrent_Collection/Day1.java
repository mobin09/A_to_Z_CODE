

import java.util.ArrayList;
import java.util.Iterator;
public class Day1 extends Thread{

    static ArrayList al = new ArrayList();
    
    @Override
     public void run(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        al.add("D");

     }

    public static void main(String[] args){
        System.out.println("Hello Wolrd");
        al.add("A");
        al.add("B");
        al.add("C");

        Day1 thread1 = new Day1();
        thread1.start();
        
        Iterator it = al.iterator();
       

        try{
            while(it.hasNext()){
                System.out.println(it.next());
                Thread.sleep(3000);
            }
           
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    
      
    }

}
import java.util.ArrayList;
import java.util.Iterator;

public class Demo1  extends  Thread{
    static ArrayList<String> list = new ArrayList<>();

    @Override 
    public void run(){
        try{
          Thread.sleep(2000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        list.add("M");
    }

    public static void main(String[] args) throws InterruptedException {
        list.add("A");
        list.add("B");
        list.add("C");

        Demo1 d = new Demo1();
        d.start();

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            IO.println(it.next());
            Thread.sleep(3000);
        }
    }
}

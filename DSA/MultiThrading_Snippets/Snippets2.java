package MultiThrading_Snippets;

 class TestThread extends Thread{
    @Override
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("A");
            System.out.println("B");
        }
    }
 }

class DemoThread extends Thread{
    @Override
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println("C");
            System.out.println("D");
        }
    }
}



public class Snippets2 {
    public static void main(String[] args){
        TestThread t1 = new TestThread();
        DemoThread t2 = new DemoThread();

        t1.start();
        t2.start();

    }
}

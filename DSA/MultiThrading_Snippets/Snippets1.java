package MultiThrading_Snippets;

class Counter implements Runnable{
    private int count = 3;
    @Override
    public void run(){
        System.out.println(count--);
    }

}


public class Snippets1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Counter());
        Thread t2 = new Thread(new Counter());
        Thread t3 = new Thread(new Counter());

        Thread[] threads = {t1,t2,t3};

        for(Thread t : threads){
            t.start();
        }

    }
}
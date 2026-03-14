class Counter{
    int count = 0;
    public synchronized void increment(){
        count++;
    }
}
public class Threads2 {
    public static void main(String[] args) {
        Counter c = new Counter();
        Runnable r1 = () -> 
        {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };
        Runnable r2 = () -> 
        {
            for (int i = 1; i <= 1000; i++) {
                c.increment();
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println(c.count);
    }
}

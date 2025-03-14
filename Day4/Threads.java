class MyThread extends Thread{
    // initiated run method for Thread
    public void run(){      
      	String str = "Thread Started Running...";
        System.out.println(str);
    }
}
class MyThread1 implements Runnable{
  	// Method to start Thread
    public void run(){       
      	String str = "Thread is Running Successfully";
        System.out.println(str);
    }

}
class Ab extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("hi");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class Bc extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("hello");
            try{
                Thread.sleep(1000); 
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}   
public class Threads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        MyThread1 t2 = new MyThread1();
        Thread t3 = new Thread(t2);
        t3.start();
        Ab t4 = new Ab();
        Bc t5 = new Bc();
        t4.start();
        t5.start();
    }
}

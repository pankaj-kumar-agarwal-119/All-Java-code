

class MyRunnable implements Runnable {
    public void run(){
     for(int i=1;i<=5;i++){
        System.out.println(i);
      try{
        Thread.sleep(1000);
      }
      catch(InterruptedException e){
        e.printStackTrace();
      }
     }
    }
}
public class T3 {
    public static void main(String args[]){
    MyRunnable r1 = new MyRunnable();
    Thread t1 = new Thread(r1);
    t1.start();

    Thread t2 = new Thread(r1);
    t2.start();
    }
}
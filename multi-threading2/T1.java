

class MyThread extends Thread {
    public void run(){
       for(int i=1;i<=5; i++){
        System.out.println("=> "+i);
       }
    }
}
public class T1 {
    public static void main(String args[]){
    MyThread t1 = new MyThread();
    t1.start();//start the first thread

    MyThread t2 = new MyThread();
    t2.start();

    MyThread t3 = new MyThread();
    t3.start();
    }
}
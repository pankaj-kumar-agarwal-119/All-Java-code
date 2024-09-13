
class MyThread2 implements Runnable{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
class A2{
    public static void main(String args[]){
   MyThread2 ob1 = new MyThread2();
   Thread t1 = new Thread(ob1);
   t1.start();
    }
}
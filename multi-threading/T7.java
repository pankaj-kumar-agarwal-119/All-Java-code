
class Counter {
    public int count=0;
    public void inc(){
        count++;
    }
    public int getCount(){
        return this.count;
    }
}

class MyThread extends Thread {
    public void run(){
        Counter on = new Counter();
        for (int i = 0; i < 10; i++) {
            on.inc();
        }
    }
}

class T7 {
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();
    }
}
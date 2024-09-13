class Counter {
    static int count =0;
    public synchronized  void increment(){
        count++;//read+inc + write
    }
    public  static int getCount(){
        return count;
    }
}

class T6 implements Runnable {
    public static Counter counter;
    public static void main(String args[]) throws InterruptedException {
        counter = new Counter();
        T6 g1 = new T6();
        Thread t1 = new Thread(g1);
        // t1.start();

        T6 g2 = new T6();
        Thread t2 = new Thread(g2);
        // t2.start();
        //start
         t1.start();
         t2.start();
         
         t1.join();//wait t1 thread to get completed
         t2.join();//wait t2 thread to geet completed
        
        System.out.println("The cout is "+Counter.getCount());
    }
    public void run(){
        for(int i=1;i<=1000;i++){
            counter.increment();
        }
    }

    
}
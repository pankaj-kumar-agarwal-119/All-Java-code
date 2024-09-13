
class T5 implements Runnable {

    public static Thread t1;//only declared
    // public static ThreadStates obj;
    public static void main(String args[]) {
        T5 ob = new T5();
        t1 = new Thread(ob);
        System.out.println(t1.getState());//NEW
        t1.start();
        System.out.println(t1.getState());//Runnable
    }

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(t1.getState());//TIMED_WAITING
        } catch (InterruptedException e) {
            System.out.println("The exception is : " + e);
        }
    }
}

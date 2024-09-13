
class Mypriority extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " with priority " + Thread.currentThread().getPriority());
        }
    }
}

class T4 {

    public static void main(String args[]) {
        Mypriority t1 = new Mypriority();
        Mypriority t2 = new Mypriority();

        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t2.start();
        t1.start();
    }
}

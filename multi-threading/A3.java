
class MyThread3 extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("The exception is : " + e);
            }
        }
    }
}

class A3 {
    public static void main(String args[]) {
        MyThread3 x1 = new MyThread3();
        x1.start();
        MyThread3 x2 = new MyThread3();
        x2.start();
    }
}

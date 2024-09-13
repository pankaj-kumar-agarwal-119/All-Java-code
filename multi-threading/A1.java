
class My1 extends Thread {

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (Exception er) {
            System.out.println("Thee xception is : " + er);
        }
    }
}

class A1 {

    public static void main(String args[]) {
        My1 ob1 = new My1();
        ob1.start();
    }
}

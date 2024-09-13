class MyThread extends Thread {

    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The exception : "+e);
            }
        }
    }
}

class T8 {
    public static void main(String args[]){
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
    }
}
class DaemonThreadExample extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread is running.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("User thread is running.");
        }
    }

    public static void main(String[] args) {
        DaemonThreadExample t1 = new DaemonThreadExample(); // User thread
        DaemonThreadExample t2 = new DaemonThreadExample(); // Daemon thread

        t2.setDaemon(true); // Setting t2 as daemon thread

        t1.start(); // Start user thread
        t2.start(); // Start daemon thread

        System.out.println("Main thread execution complete.");
    }
}
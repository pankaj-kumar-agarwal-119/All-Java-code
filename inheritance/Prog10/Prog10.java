//interface iwth multiple methods
interface Vehicle{
    void start();
    void stop();
}
class Car implements Vehicle{
    public void start(){
  System.out.println("Start the Car ");
    }
    public void stop(){
        System.out.println("Stop the Car ");
    }
}
class Prog10{
    public static void main(String args[]){
     Vehicle xRef = new Car();
     xRef.start();
     xRef.stop();
    }
}
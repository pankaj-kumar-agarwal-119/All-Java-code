interface Flyer{
void fly();
}
interface Swimmer{
void swim();
}
class Duck implements Flyer,Swimmer{//multiple interface inheritance
public void fly(){
System.out.println("Flying..");
}
public void swim(){
    System.out.println("Swiming..");
}
}
class Prog16 {
    public static void main(String args[]){
         Duck ob1 = new Duck();
         ob1.fly();
         ob1.swim();
    }
}
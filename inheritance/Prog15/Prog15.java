interface Animal{
    void eat();
}
interface Mammal extends Animal{
    void walk();
}
class Human implements Mammal{
    public void eat(){
        System.out.println("Eating..");
    }
    public void walk(){
        System.out.println("Walking..");
    }
}
class Prog15{
    public static void main(String args[]){
        Mammal xRe = new Human();
        xRe.eat();
        xRe.walk();
    }
}
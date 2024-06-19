abstract class Animal{
    //declaring the abstract method
    public abstract void makeSound();

    //Regular method
    public void eat(){
        System.out.println("The animal eats food.");
    }
}
class Dog extends Animal {//Inheriting a abstarct class
    
    public void makeSound(){
        System.out.println("Woof");
    }

}
class Prog4{
    public static void main(String args[]){
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.eat();
    }
}
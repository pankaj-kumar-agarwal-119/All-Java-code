interface Animal {
    void makeSound();
}
class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Woof");
    }
}
class Prog9{
    public static void main(String args[]){
        Animal objRef = new Dog();
        objRef.makeSound();
    }
}
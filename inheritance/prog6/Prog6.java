abstract class Animal{//cant create the object of abstract class but we can utilize its contructor inside the sub class
    String name;
    int age;
    String habitat;
    public Animal(String name,int age,String habitat){
      this.name=name;
      this.age = age;
      this.habitat = habitat;
    }
    public abstract void makeSound();
    public void displayDetails(){
    System.out.println("Name : "+this.name);
    System.out.println("Age : "+this.age);
    System.out.println("Habitat : "+this.habitat);
    }
}
class Dog extends Animal{
    Dog(String name,int age,String habitat){
     super(name,age,habitat);
    }
    public void makeSound(){
        System.out.println("Woof");
    }
    public void isDogVaccinated(){
        System.out.println("Yes dog is vaccinated");
    }
}
class Cat extends Animal{
    Cat(String name,int age,String habitat){
        super(name,age,habitat);
       }
       public void makeSound(){
        System.out.println("Woof");
    }
    public void isCatVaccinated(){
        System.out.println("Yes cat is vaccinated");
    }
}
class Prog6{
    public static void main(String args[]){
        Dog ob1 = new Dog("Bijli",3,"Office");
        ob1.makeSound();
        ob1.displayDetails();
        ob1.isDogVaccinated();
        // Animal ob3= new Animal("ss",3,"jj"); | Prog6.java:38: error: Animal is abstract; cannot be instantiated
        Animal x1 = new Dog("Alpha",4,"Home");
        x1.displayDetails();
        x1.makeSound();
        // x1.isVaccinated();
        Animal x2 = new Cat("Beta",2,"Home");
        x2.displayDetails();
        x2.makeSound();
        // x2.isCatVaccinated();
        // x2 = new Dog("Gamma",4,"Home");
        // x2.displayDetails();
        // x2.makeSound();
    }
}

// i)Create a class Employee (name,id,salary)
// Subclass : Manager (teamSize) + Developer (programmingLanguage) + Intern (collegeName)  ⇒ Hierarchical Inheritance
class Vehicle {
    private String brand;
    private int year;
    private double price;

    Vehicle(String brand,int year,double price){
     this.brand = brand;
     this.year = year;
     this.price = price;
    }

    void displayDetails(){
        System.out.println(this.brand + "," + this.year + ","+this.price);
    }
}
class Car extends Vehicle{
  private int noOfDoors;
  Car(String brand,int year,double price,int noOfDoors){
   super(brand,year,price);
   this.noOfDoors=noOfDoors;
  }
  @Override
  void displayDetails(){
    super.displayDetails();
    System.out.println(this.noOfDoors);
}
}

class Bike extends Vehicle {
    private boolean hasCarrier;
    Bike(String brand,int year,double price,boolean hasCarrier){
      super(brand,year,price);
      this.hasCarrier = hasCarrier;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println(this.hasCarrier);
    }
}

class Truck extends Vehicle {
    private double loadCapacity;
    Truck(String brand,int year,double price,double loadCapacity){
      super(brand,year,price);
      this.loadCapacity = loadCapacity;
    }
    @Override
    void displayDetaiils(){
        super.displayDetails();
        System.out.println(this.loadCapacity);
    }
}
class Prog3{
    public static void main(String args[]){
        Car car = new Car("Toyota Fortuner",2020,3000000,4);
        Bike bike = new Bike("Honda",2019,1500,true);
        Truck truck = new Truck("Volvo",2021,8900000,10);
        car.displayDetails();
        bike.displayDetails();
        truck.displayDetails();
    }
}
abstract class Employee {
    private String name;
    private int id;
    private double salary;
    private static int count;
    static {
        count = 0;
    }
    Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
        count++;
    }
    Employee(String name,int id){
        this.name = name;
        this.id = id;
        count++;
    }
    double getSalary(){
        return this.salary;
    }
    public static int getCount(){
        return count;
    }
    abstract double calculateBonus();
    void displayDetails(){
        System.out.println(this.name+this.id+this.salary);
    }
}
class Manager extends Employee{
    int teamSize;
    Manager(String name,int id,double salary,int teamSize){
    super(name,id,salary);
    this.teamSize = teamSize;
    }
    @Override
    void displayDetails(){
    super.displayDetails();
    System.out.println(this.teamSize);
    }
    @Override
    double calculateBonus(){
        double salary = this.getSalary();
        return salary*0.1*teamSize;

    }
}
class Developer extends Employee{
    String programminglanguage;
    Developer(String name,int id,double salary,String programminglanguage){
        super(name,id,salary);
        this.programminglanguage = programminglanguage;
    }
    @Override
    double calculateBonus(){
        double salary = this.getSalary();
        return salary*0.2;
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println(this.programminglanguage);
    }
}
class Prog8{
    public static void main(String args[]){
        Manager manager = new Manager("Mohan",27,600000,15);
        manager.displayDetails();
        System.out.println("Bonus for manager : "+manager.calculateBonus());

        Developer dev = new Developer("Sohan",27,100000,"java");
        dev.displayDetails();
        System.out.println("Bonus for manager : "+dev.calculateBonus());

        System.out.println("The object created : "+Employee.getCount());


    }
}
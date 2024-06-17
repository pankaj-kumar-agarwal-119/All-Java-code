class Employee{
    private String name;
    private int age;
    private String designation;
    Employee(String name,int age,String designation){
    this.name = name;
    this.age=age;
    this.designation=designation;
    }
    void display(){
        System.out.println(this.name+","+this.age+","+this.designation);
    }
}
class Manager extends Employee{
    private String teamName;
    Manager(String name,int age,String designation,String teamName){
        super(name,age,designation);
        this.teamName = teamName;
    }
    @Override
    void display(){
        super.display();
        System.out.println(this.teamName);
    }
}
class SeniorManager extends Manager{
    private int numberOfProjects;
    SeniorManager(String name,int age,String designation,String teamName,int numberOfProjects){
    super(name,age,designation,teamName);
    this.numberOfProjects = numberOfProjects;
    }
    @Override
    void display(){
    super.display();
    System.out.println(this.numberOfProjects);
    }
} 
class Prog2{
    public static void main(String args[]){
        SeniorManager ob1 = new SeniorManager("Mohan",28,"Senior Project manager","Alpha Team",20);
        ob1.display();
    }
}
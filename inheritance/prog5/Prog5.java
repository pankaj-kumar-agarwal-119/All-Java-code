abstract class Shape {
    abstract void area();
    void displayDetails(){
        System.out.println("Inside the Shape class");
    }
}
class Circle extends Shape{
    private double radius;
    private double area;
    Circle(double radius){
        this.radius = radius;
    }
    void area(){
        double result = 3.14*radius*radius;
        this.area = result;
    }
    @Override
    void displayDetails(){
      System.out.println("The radius of the circle is "+this.radius+" and area is :"+this.area);  
    }
}
class Triangle extends Shape{
    private double base;
    private double height;
    private double area;

    Triangle(double base,double height){
     this.base = base;
     this.height = height;
    }
    void area(){
        this.area = (this.base * this.height)/2;
    }
    @Override
    void displayDetails(){
        System.out.println("Base : "+this.base+" , Height : "+this.height+" , Area : "+this.area);
    }
}

class Prog5{
    public static void main(String args[]){
        Triangle ob1 = new Triangle(12.2,14.1);
        ob1.area();
        ob1.displayDetails();
        //---------
        Circle ob2 = new Circle(10);
        ob2.area();
        ob2.displayDetails();
    }
}
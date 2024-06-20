abstract class MyMath{
//yes the abstract class do have the static members
public static final double PI=3.14;
//static method
public static double add(double a , double b){
 return a+b;
}
public abstract double compute(double a,double b);
}
class Addition extends MyMath{
    @Override
    public double compute(double a ,double b){
        return a+b;
    }
}
class Prog7{
    public static void main(String args[]){
        MyMath ob1 = new Addition();
        double ans = ob1.compute(2,7);
        System.out.println("The sum is 1 : "+ans);
        //use the static member
        System.out.println("Pi : "+MyMath.PI);
        double ans2 = MyMath.add(10,20);
        System.out.println("The sum is 2 : "+ans2);
    }
}
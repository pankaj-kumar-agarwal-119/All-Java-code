class OuterClass {
    interface InnerInterface{
        void display();//by default abstract in nature
    }
}
class ImplementingClass implements OuterClass.InnerInterface{
    public void display(){
        System.out.println("Overriding the abstract method");
    }
}
class Prog14{
    public static void main(String args[]){
        OuterClass.InnerInterface xRef = new ImplementingClass();
        xRef.display();
    }
}
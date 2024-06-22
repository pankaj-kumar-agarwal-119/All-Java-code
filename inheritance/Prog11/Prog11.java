interface Bird{
    void fly();
    default void sing(){
        System.out.println("Singing a song");
    }
}
class Sparrow implements Bird{
    @Override
    public void fly(){
   System.out.println("Flying..");
    }
}
class Prog11{
    public static void main(String args[]){
        Bird xRef = new Sparrow();
        xRef.fly();
        xRef.sing();
       }
}
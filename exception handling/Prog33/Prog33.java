class Prog33{
    public static void main(String args[]){
        try{

try{
int result = 10/0;
}
catch(ArithmeticException e){
    System.out.println("Inner catch : "+e.getMessage());
}
String str=null;
System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("Outer catch: "+e.getMessage());
        }
    }
}
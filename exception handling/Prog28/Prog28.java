class Prog28 {
    public static void main(String args[]){
        try{
          int data = 25/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}
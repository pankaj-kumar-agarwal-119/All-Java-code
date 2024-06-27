class Prog29{
    public static void main(String args[]){
        try{
        int[] arr = new int[5];
        arr[5] = 30/1;
        }
        catch(ArithmeticException e){
           System.out.println("Atithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds Exception");
        }
        finally{
            System.out.println("Finally block gets executed");
        }
    }
}
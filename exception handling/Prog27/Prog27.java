class Prog27{
    public static void main(String args[]){
        //synatx for exception handling start

        try{
           int[] arr = {1,2,3};
           System.out.println("The element is : "+arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Array index is out of bounds");
        }

        //syntax for exception handling end
    }
}
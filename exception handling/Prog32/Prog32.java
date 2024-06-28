class CustomException extends Exception {
   CustomException(String message){
      super(message);//super will invoke the parent class ka constructor
   } 
}


class Prog32{
    public static void main(String args[]){
     try{
      validateAge(15);
     }
     catch(CustomException e){
    System.out.println("Caught custom exception : "+e.getMessage());
     }
    //  catch(Exception e){ //correct code
    //     System.out.println("Caught custom exception : "+e.getMessage());
    //      }
    }
    static void validateAge(int age) throws CustomException{
       if(age<18){
        throw new CustomException("Age must be 18 or above");
       }
    }

}
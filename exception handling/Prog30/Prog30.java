class Prog30{
    static void validate(int age){
      if(age<18){
        throw new ArithmeticException("Not Valid");
      }
      else{
        System.out.println("Welcome to vote");
      }
    }
    public static void main(String args[]){
        try{
        validate(13);
        }
        catch(ArithmeticException e){
            System.out.println("There is some problem in your age limit to vote");
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



class BufferedStreamConsoleEx {
    public static void main(String args[]){
        try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first number : ");
        int firstNumber = Integer.parseInt(reader.readLine());
        System.out.println("Enter second number : ");
        int secondNumber = Integer.parseInt(reader.readLine());
        int sum = firstNumber + secondNumber;
        System.out.println("The sum is : "+sum);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
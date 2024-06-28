import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Prog31 {
    public static void main(String args[]){

        try{
      File file = new File("abc.txt");
      Scanner scanner = new Scanner(file);

        }
        catch(FileNotFoundException e){
System.out.println("File not found "+e.getMessage());
        }

    }
}
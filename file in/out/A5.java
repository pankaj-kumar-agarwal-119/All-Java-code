
import java.io.File;

/*
 * delete file in java
 */
class A5 {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if(file.delete()){
            System.out.println("Deleted the file : "+file.getName());
        }
        else{
            System.out.println("Failed to delete.");
        }
    }
}
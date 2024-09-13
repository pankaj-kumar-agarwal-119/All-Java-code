/*
 File system in java. Java provides several classes to work with files. This includes creating,deleting,checking the file attribute

 */
//Working with file creating in java
import java.io.File;
import java.io.IOException;
class A1{
    public static void main(String args[]){
        File file = new File("example.txt");
        try {
            if(file.createNewFile()){
            System.out.println("File created : "+file.getName());
            }
            else{
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
 File.createNewFile() : Creates a new file if it does not exist
 */
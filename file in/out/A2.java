/*
 getting properties of file in java
 */
//Working with file creating in java
import java.io.File;
import java.io.IOException;
class A2{
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

        //checking some properties of file
        System.out.println("File path : "+file.getAbsolutePath());
        System.out.println("Is File : "+file.isFile());
        System.out.println("File size : "+file.length()+" bytes");
        System.out.println("File name : "+file.getName());
        System.out.println("is Writable : "+file.canWrite());// checks whether file has write permission
        System.out.println("is Readable : "+file.canRead());// checks whether file has read permission
    }
}
/*
 File.createNewFile() : Creates a new file if it does not exist
 */
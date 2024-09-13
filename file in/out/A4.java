/*
 append operation in file
 */
//Working with file creating in java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class A4 {

    public static void main(String args[]) {
        File file = new File("example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created : " + file.getName());
            } else {
                System.out.println("File already exist");
            }

            //Write content to the file
            FileWriter writer = new FileWriter("example.txt",true);
            /*
             FileWriter(File file,boolean append) : The second parameter 'true' enables appending the existing content
             * 
             */
            writer.write("Delhi is the capital of india. Peacock is our national bird");
            writer.close();
            System.out.println("Successfully written the file");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //checking some properties of file
        System.out.println("File path : " + file.getAbsolutePath());
        System.out.println("Is File : " + file.isFile());
        System.out.println("File size : " + file.length() + " bytes");
    }
}
/*
 File.createNewFile() : Creates a new file if it does not exist
 */

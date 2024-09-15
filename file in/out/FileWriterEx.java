/*
 Write operation in file
 */
//Working with file creating in java
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class FileWriterEx {

    public static void main(String args[]) {
        File file = new File("example.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created : " + file.getName());
            } else {
                System.out.println("File already exist");
            }

            //Write content to the file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("India is full of diversity. We all have to live with harmony");
            writer.write("National bird is peacock");
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

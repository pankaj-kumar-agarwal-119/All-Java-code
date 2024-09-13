
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/*
 java I/O is divided into streams, which represent an abstract of data flow
 Java I/O streams can be classified into 2 types : 
 1. Byte Stream : Handle binary data (eg. images , audio file)
 2. Character stream : Handle the text data (ex: text files)
 */
//Byte Stream . InputStream : Base class to read byte data
//OutputStream : Base class to write byte data
/*
 * 
 * In this example we will read the file in byte forat in buffer
 */
class A6 {

    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            if (file.createNewFile()) {
                System.out.println("File created : " + file.getName());
            } else {
                System.out.println("File already exist");
            }
//Wrote some content
            FileWriter writer = new FileWriter("input.txt", true);
            writer.write("India, officially the Republic of India.");
            writer.write("Bounded by the Indian Ocean on the south, the Arabian Sea on the southwest, and the Bay of Bengal on the southeast, it shares land borders with Pakistan to the west");
            writer.close();

            //Now moving adat from input.txt to output.txt
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt");
            int byteData;
            while ((byteData = in.read()) != -1) {
                out.write(byteData);
            }
        } catch (Exception e) {
        }
    }
}

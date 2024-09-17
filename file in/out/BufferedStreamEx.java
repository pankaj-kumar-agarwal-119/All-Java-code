
/*
 *The 3rd tye of stream is BufferedStream. It is used to enhance the performance by buffering input and output operations. They 
 thus reduce the number of I/O operations by accumulating multiple bytes or characters into memory before performing any operation
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


class BufferedStreamEx {
    public static void main(String args[]){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("comic1.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("comi1_output.txt"));
            String line;
            while ((line=reader.readLine()) != null) { 
                writer.write(line);
                writer.newLine();
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*
 BufferedReader : reads lines of text efficiently using the readLine() method
 BufferedWriter : writes text more efficiently and add new line through writer.newLine()
 */
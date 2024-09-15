
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 Character stream are specifically used for handling text data. They automatically handle character encoding, making them ideal for reading and writing files , for user friendly
 Reader : Base class for reading character data
 Writer : 
 */
class CharacterStreamEx1 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("comic1.txt");
            FileWriter writer = new FileWriter("output_comic1.txt");
            int character;
            while((character = reader.read()) != -1){
                writer.write(character);
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
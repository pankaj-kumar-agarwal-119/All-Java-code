
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


class ByteStreamWithBuffer {
    public static void main(String[] args) {
        String inputFilePath = "audio_1.mp3";//Path for input audio file
        String outputFilePath = "output_audio_1.mp3";//Path for output audio file
        try {
            FileInputStream inputStream = new FileInputStream(inputFilePath);
            FileOutputStream outputStream = new FileOutputStream(outputFilePath);
            //buffer to hold data temporarily
            byte[] buffer = new byte[1024];
            int byteRead;
            //Read and write the input file to the output file
            while((byteRead = inputStream.read(buffer)) != -1){
               outputStream.write(buffer,0,byteRead);
            }
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
/*
 FileInputStream : Reads the raw bytes of input audio file
 FileOutputStream : Writes the raw bytes to te output file
 Buffer : A byte array (in this case 1024 bytes) is used to read and write data in chunks to avoid reading or writing data one byte at a time
 
 */
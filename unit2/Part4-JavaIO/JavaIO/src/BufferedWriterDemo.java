import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("abc.txt", false);

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        // write to the file
        bufferedWriter.write("ABCd");

        // add a new line
        bufferedWriter.newLine();

        // write an array of characters
        char[] charArray = new char[] { 'a', 'b', 'c', 'd', 'e' };
        bufferedWriter.write(charArray);

        // write a single character
        bufferedWriter.write('f');

        bufferedWriter.close();
        
    }
}

// BufferWriter constructors
    // BufferedWriter bufferedWriter = new BufferedWriter(Writer writer);
    // BufferedWriter bufferedWriter = new BufferedWriter(Writer writer, int size);
    // BufferedWriter bufferedWriter = new BufferedWriter(Writer writer, int size, boolean append);

// BufferedWriter methods
    // write() - writes a single character to the internal buffer
    // write(char[] array) - writes a character to internal buffer and stores in the specified array
    // write(String s) - writes specified string to writer


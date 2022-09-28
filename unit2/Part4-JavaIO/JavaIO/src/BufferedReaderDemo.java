import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main (String[] args) throws IOException {
        // create a FileReader object
        FileReader fileReader = new FileReader("abc.txt");

        // create a BufferedReader object
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // read character by character
        int i = bufferedReader.read();
        while(i != -1) {
            System.out.print((char) i);
            i = bufferedReader.read();
        }

        // read from the file
        // String line = bufferedReader.readLine();
        // while (line != null) {
        //     System.out.println(line);
        //     line = bufferedReader.readLine();
        // }

        // read with help of an array
        // char[] c = new char[100];
        // bufferedReader.read(c, 4, 5);
        // System.out.println(c);

        // close the stream
        bufferedReader.close();
    }
    
}

// BufferedReader constructors
    // high level stream
    // minimizes communication between the class and the disk
    // faster and more efficient

    // BufferedReader bufferedReader = new BufferedReader(Reader reader);
    // BufferedReader bufferedReader = new BufferedReader(Reader reader, int size);

// BufferedReader methods
    // read() - reads a single character from the internal buffer
    // read(char[] array) - reads a character from internal buffer and stores in the specified array
    // read(char[] cbuf, int offset, int length) - reads the number of characters from the internal buffer equal to length from 
        // the reader and stores in the specified array starting from the offset position
    // close() - closes the stream
    // readLine() - reads a line of text from the reader

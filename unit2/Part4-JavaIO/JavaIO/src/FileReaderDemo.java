import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        // create a FileReader object
        FileReader fileReader = new FileReader("abc.txt");
        

        // read from the file one character at a time
        // int i = fileReader.read();

        // while (i != -1) {
        //     System.out.print((char) i);
        //     i = fileReader.read();
        // }

        // read from all the characters in the file at one time
        // char[] c = new char[500];
        // fileReader.read(c);
        // System.out.println(c);

        

        char[] c = new char[100];
        fileReader.read(c, 1, 5);
        System.out.println(c);

        // for (char i : c) {
        //     System.out.print("Char: " + i);
        // }
        
        // close the stream
        fileReader.close();

        // run and the file will be created in the current directory
    }
    
}

// FileReader constructors
    // FileReader input = new FileReader(String name);
        // file name is a string
    // FileReader fileReader = new FileReader(File filename );
        // file name is a file object
    // FileReader fileReader = new FileReader(String name, Charset cs);

// FileReader methods
    // read() - reads a single character
    // read(char[] array) - reads a character from the reader and stores in the specified array
    // read(char[] cbuf, int offset, int length) - reads the number of characters equal to length from 
        // the reader and stores in the specified array starting from the offset position
    // close() - closes the stream

    

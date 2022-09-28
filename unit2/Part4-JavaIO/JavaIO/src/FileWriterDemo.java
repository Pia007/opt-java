import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        // create a FileWriter object
        FileWriter fileWriter = new FileWriter("abc.txt", false);

        // write to the file
        fileWriter.write("Hello World");

        fileWriter.write("\n");

        fileWriter.write("This is a new line");

        fileWriter.write("\n");

        char[] charArray = new char[]{ 'a', 'b', 'c', 'd', 'e' };
        fileWriter.write(charArray);

        fileWriter.write("\n");

        fileWriter.write("I set the boolean to 'true' and appended the data.");

        //must flush the stream and close the stream
            // why flush? Data is stored in a cache when working with streams
            // flush forces the data to be written to the file  
        fileWriter.flush();
        fileWriter.close();

        // run and the file will be created in the current directory
       
    }
    
}

// FileWriter constructors
    // FileWriter variableName = new FileWriter(String fileName));
        // ex) FileWriter fw = new FileWriter("abc.txt");
    // FileWriter variableName = new FileWriter(File filename);
        // create a file object first then pass the file name to the constructor
        // ex) FileWriter fw = new FileWriter(new File("abc.txt"));
    // FileWriter variableName = new FileWriter(String fileName, boolean append);
        // create a file object first then pass the string file name  and true/false to the constructor
        // append a boolean value  - specify if you want to overwrite or append to the file
    // FileWriter variableName = new FileWriter(File filename, boolean append);
        // create a file object first then pass file name and the true/false the constructor
        // append a boolean value  - specify if you want to overwrite or append to the file
    // FileWriter variableName = new FileWriter(String file, Charset cs);
        // create a file object first then pass file name and character encoding tp the constructor
        // append a boolean value  - specify if you want to overwrite or append to the file
// IOException 
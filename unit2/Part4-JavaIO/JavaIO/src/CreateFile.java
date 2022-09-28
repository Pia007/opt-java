import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File textFile = new File("abc.txt");   // create file object
        System.out.println(textFile.exists());  // check if file exists - false

        // get the current directory
        String currentDir = System.getProperty("user.dir");
        System.out.println("The current directory is " + currentDir);

        // check to see if src folder exists
//        File srcDir = new File("src");
//        System.out.println(srcDir.exists());  // true

    }
}

// File class - creates files
// Methods of the file class
    // createNewFile() - creates a new file
    // canWrite() - checks app can write the file
    // canRead() - checks app can read the file
    // isDirectory() - checks if the file is a directory
    // getName() - return the name of the file
    // lastModified() - returns the last modified date of the file
    // mkdir() - creates a directory
    // delete() - deletes a file
    // list() - returns an array of files in the directory   

// file object v file on system
    // file object - reps a file in the app 
    // file on system - file on the hard drive

// JavaIO 4 abstract classes - form the basis Java heirarchy
    // InputStream - all input bytes stream
    // OutputStream - all output byte stream
    // Reader - all input character stream
    // Writer - all output character stream

// Classes for reading and writing operations
    // FileInputStream - reads file data as the stream of bytes
    // FileOutputStream - writes data to a file as a stream of bytes
    // FileReader - reads file data as a stream of characters
    // FileWriter - writes data to a file as a stream of characters
    // BufferedInputStream - reads data as bytes from the existing stream to improve its performance
    // BufferedOutputStream - writes data as bytes to the existing stream to improve its performance
    // BufferedReader - reads data as characters from the existing stream to improve its performance
    // BufferedWriter - writes data as characters to the existing stream to improve its performance
    // ObjectInStream - deserializes the java objects from an input stream
    // ObjectOutStream - serializes the java objects to an output stream

    // NOTE input/ouput in name are working with byte data format
    // NOTE reader/writer in name are working with character data format
    // NOTE buffer in name are working with high level streams
        // take corresponding low level stream object and improves its performance





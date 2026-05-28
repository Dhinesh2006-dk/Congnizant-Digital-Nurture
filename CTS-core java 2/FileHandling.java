import java.io.FileWriter;
import java.io.IOException;
public class FileHandling {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello Everyone Welcome to Java File Handling!");
            fw.close();
            System.out.println("File created and data written successfully.");
        }
        catch(IOException e) {
            System.out.println("Error occurred while handling file.");
        }
    }
}
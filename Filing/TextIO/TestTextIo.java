package JavaOOP.Filing.TextIO;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class TestTextIo {
    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("D:\\Visual Studio\\Java\\JavaOOP\\Filing\\TextIO\\temp.txt");
            output.write("Java");
            output.write("\tC++");
            output.write("\tC#");
            output.close();
            Scanner input = new Scanner(new File("temp.txt"));
            System.out.println(input.nextLine());
            input.close();
        }
        catch (Exception e) {
            System.out.println("Exception caught");
            System.out.println(e.toString());
        }
    }
}

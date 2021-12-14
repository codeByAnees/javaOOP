package JavaOOP.Filing.TextIO;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Practice {
    public static void main(String[] args) {
        // try {
        // File file = new File("D:\\Visual Studio\\Java\\JavaOOP\\Filing\\TextIO\\MyFile.dat");
        // FileOutputStream output = new FileOutputStream(file);
        // for (int i = 1; i <= 10; i++) {
        //     output.write(i);
        // }
        // output.close();
        // FileInputStream input = new FileInputStream(file);
        // // available method returns bytes available
        // System.out.println("  " + input.available());
        // int value = -1;
        // //input.skip(4); // skips first four value
        // //input.mark(4); 
        // while ((value = input.read()) != -1) {
        //     System.out.println(value);
        // }
        // System.out.println("  " + input.available());
        // input.close();
        // System.out.println(input.markSupported());
        // }
        // catch (Exception e) {
        //     System.out.println("Exception caught");
        //     System.out.println(e.toString());
        // }


        // Filteroutputstream filterinputstream
        File file = new File("D:\\Visual Studio\\Java\\JavaOOP\\Filing\\TextIO\\FirstDataFile.dat");
        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file, true));
            out.writeUTF("Ali");
            out.writeDouble(13.7);
            out.writeUTF("Ahmad");
            out.writeDouble(17);
            out.writeUTF("Saba");
            out.writeDouble(20.4);
            out.close();
            try {
                DataInputStream in = new DataInputStream(new FileInputStream(file));
                while (true) {
                    System.out.println(in.readUTF() + "\t" + in.readDouble());
                }
            }
            catch (EOFException e) {
                System.out.println("End of file");
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

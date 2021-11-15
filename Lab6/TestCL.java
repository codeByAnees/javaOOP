package JavaOOP.Lab6;

public class TestCL {
    public static void main(String[] args) {
        Computer c = new Computer();
        Laptop l = new Laptop();
        System.out.print("\n\t\t<--Computer-->");
        c.display();
        System.out.print("\n\t<--Laptop-->");
        l.display();
    }
    
}

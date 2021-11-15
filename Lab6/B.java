package JavaOOP.Lab6;

public class B extends A {
    private int b = 7;
    public B() {
        b++;
        this.test();
    }
    public void test() {
        b = b * 8;
        System.out.print("\nb = " + b);
    }
}

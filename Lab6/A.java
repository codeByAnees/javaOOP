package JavaOOP.Lab6;

public class A {
    private int a = 10;
    public A() {
        a *= 2;
        this.test();
    }
    public void test() {
        a = a * 3;
        System.out.print("\na = " + a);
    }
}

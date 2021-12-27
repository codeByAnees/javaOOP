package JavaOOP.Practice;

public class TestProceduralOOP {
    public static void main(String[] args) {
        ProceduralOOP p = new ProceduralOOP(1, "Aqib", 100);
        System.out.println(p.toString());
        ProceduralOOP p1 = new ProceduralOOP();
        p1.readData();
        System.out.println(p1.toString());
    }
}

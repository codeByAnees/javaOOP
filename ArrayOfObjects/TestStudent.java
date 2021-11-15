package JavaOOP.ArrayOfObjects;

public class TestStudent {
    public static void main(String[] args) {
        float[] m = {20.6f, 90.7f, 76.7f, 86.5f, 87.5f}; 
        Student s1 = new Student("Anees", m);
        Student s2 = new Student("Muneeb", m);
        Student s3 = s1.compareAverage(s2);
        if (s3 == null) {
            System.out.print("Both have equal average");
        }
        else s3.showData();
    }
    
}

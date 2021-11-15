package JavaOOP.ImmutableClasses;

public class Student {
    private int id;
    private String name;

    public Student() {
        id = 0;
        name = null;
    }
    public Student (int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void setID(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void showData() {
        System.out.print("\nID: " + id + "\tName: " + name);
    }
}

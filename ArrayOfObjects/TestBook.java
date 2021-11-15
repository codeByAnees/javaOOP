package JavaOOP.ArrayOfObjects;

public class TestBook {
    public static void main(String[] args) {
        Book[] b = new Book[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = new Book();
            b[i].readData();
        }
        System.out.print("Book with highest price is ");
        Book b1 = Book.comparePagesH(b);
        b1.showData();
        System.out.print("\nBook with lowest price is ");
        Book b2 = Book.comparePagesL(b);
        b2.showData();
    }
}

package JavaOOP.ArrayOfObjects;
import java.util.Scanner;
public class Book {
    private String title;
    private String author;
    private float price;
    private int pages;
    public Book() {
        title = null;
        author = null;
        price = 0.0f;
        pages = 0;
    }
    public Book(String title, String author, float price, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pages = pages;
    }
    public void readData() {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter title of book: ");
        title = input.nextLine();
        System.out.print("Enter author name: ");
        author = input.nextLine();
        System.out.print("Enter book price: ");
        price = input.nextFloat();
        System.out.print("Enter book pages: ");
        pages = input.nextInt();
    }

    public void showData() {
        System.out.print("\n\t\tBook Details");
        System.out.print("\nTitle: " + title + "\tAuthor: " + author +
                        "\nPrice: " + price + "\tPages: " + pages);
    }

    public static Book comparePriceH(Book[] b) {
        int index = 0;
        float highest = b[index].price;
        for (int i = 0; i < b.length; i++) {
            if (b[i].price > highest) {
                index = i;
            }
        }
        return b[index];
    }

    public static Book comparePriceL(Book[] b) {
        int index = 0;
        float lowest = b[index].price;
        for (int i = 0; i < b.length; i++) {
            if (b[i].price < lowest) {
                index = i;
            }
        }
        return b[index];
    }

    public static Book comparePagesH(Book[] b) {
        int index = 0;
        int highest = b[index].pages;
        for (int i = 0; i < b.length; i++) {
            if (b[i].pages > highest) {
                index = i;
            }
        }
        return b[index];
    }

    public static Book comparePagesL(Book[] b) {
        int index = 0;
        int lowest = b[index].pages;
        for (int i = 0; i < b.length; i++) {
            if (b[i].pages < lowest) {
                index = i;
            }
        }
        return b[index];
    }

    public static Book findBookByAuthorName(Book[] b, String author) {
        int index = -1;
        for (int i = 0; i < b.length; i++) {
            if (b[i].author.equals(author)) {
                index = i;
            }
        }
        if (index == -1) {
            return null;
        }
        else return b[index];
    }

    public static Book findBookByTitle(Book[] b, String title) {
        int index = -1;
        for (int i = 0; i < b.length; i++) {
            if (b[i].title.equals(title)) {
                index = i;
            }
        }
        if (index == -1) {
            return null;
        }
        else return b[index];
    }
}

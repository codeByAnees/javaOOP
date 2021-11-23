package JavaOOP.MidsLab;
import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n\t\t<-----E N C H A N T E D----->\n");
        System.out.println();    
        System.out.println("Enter 1 for ISB branch" + 
                         "\nEnter 2 for RWP branch" +
                         "\nEnter 3 for Comsats branch" +
                         "\nEnter 0 to EXIT --> ");
        System.out.println();
        int choice = input.nextInt();
        switch(choice) {
            case 0:
                break;
            case 1:
                IsbBranch I[] = new IsbBranch[1];
                for (int i = 0; i < I.length; i++) {
                    I[i] = new IsbBranch();
                    I[i].order();
                    I[i].showData();
                }
                break;
            case 2:
                System.out.print("Sorry for inconvenience! You can take away but Din-in is not available.\n");
                RwpBranch r[] = new RwpBranch[2];
                for (int i = 0; i < r.length; i++) {
                    r[i] = new RwpBranch();
                    r[i].PlaceOrder();
                    r[i].showData();
                }
                break;
            case 3:
                CU_Branch c[] = new CU_Branch[3];
                for (int i = 0; i < c.length; i++) {
                    c[i] = new CU_Branch();
                    c[i].placeOrder();
                    c[i].showData();
                }
                break;
            default:
                System.out.println("\nInvalid choice\n");
                main(args);
        }
        Enchanted e = new Enchanted();
        System.out.println("Total orders of the day are: " + e.totalOrders());
        System.out.print("Enter 0 to exit or any other number to continue: ");
        int choose = input.nextInt();
        if (choose != 0) {
            main(args);
        }
    }
}

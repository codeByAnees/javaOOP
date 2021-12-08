package JavaOOP.MidsLab;
import java.util.Scanner;
public class TestClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n\t\t<----- E N C H A N T E D ----->\n");
        System.out.println();    
        System.out.print("\nEnter 1 for ISB branch" + 
                         "\nEnter 2 for RWP branch" +
                         "\nEnter 3 for Comsats branch" +
                         "\nEnter 0 to EXIT ---> ");
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
                System.out.print("Sorry for inconvenience! \nYou can take away but Din-in is not available.\n");
                RwpBranch r[] = new RwpBranch[2];
                for (int i = 0; i < r.length; i++) {
                    r[i] = new RwpBranch();
                    r[i].PlaceOrder();
                    r[i].showData();
                }
                break;
            case 3:
                ComsatsBranch c[] = new ComsatsBranch[3];
                for (int i = 0; i < c.length; i++) {
                    c[i] = new ComsatsBranch();
                    c[i].placeOrder();
                    c[i].showData();
                }
                break;
            default:
                System.out.println("\nInvalid choice\n");
                main(args);
        }
        Enchanted e = new Enchanted();
        System.out.println("Total cups sold in the day: " + e.totalCups());
        System.out.print("\nEnter 1 to continue or any other number to exit: ");
        int choose = input.nextInt();
        if (choose == 1) {
            main(args);
        }
    }
}

// package JavaOOP.SemesterProject;
// import java.util.Scanner;

// public class Test {
//     public static void main(String[] args) {
//         int choice;
//         Scanner input = new Scanner(System.in);
//         Admin admin = new Admin();
//         do {
//             System.out.print("\nEnter 1 for admin menu \nEnter 2 for customer menu \nEnter 0 to exit --> ");
//             choice = input.nextInt();
//             if (choice == 1) {
//                 if (admin.validation()) {
//                     int opt;
//                     do {
//                         System.out.println("\nEnter 1 to search user record \nEnter 2 to edit user record");
//                         System.out.println("Enter 3 to delete user record \nEnter 4 to add new user");
//                         System.out.println("Enter 5 to view user record \nEnter 6 to set user units");
//                         System.out.print("Enter 7 to calculate customer bill \nEnter 0 to exit --> ");
//                         opt = input.nextInt();
//                         switch(opt) {
//                             case 0:
//                                 break;
//                             case 1:
//                                 // Customer customer = admin.searchCustomer();
//                                 // if (customer != null)
//                                 //     System.out.print(customer.toString());
//                                 // else System.out.println("\nNot found\n");
//                                 break;
//                             case 2:
//                                 //admin.editCustomerRec();
//                                 break;
//                             case 3:
//                                 //admin.delCustomer();
//                                 break;
//                             case 4:
//                                 //admin.addNewUser();
//                                 break;
//                             case 5:
//                                 admin.displayCustomers();
//                                 break;
//                             case 6:
//                                 //admin.setNoOfUnits();
//                                 break;
//                             case 7:
//                                 //admin.calBill();
//                                 break;
//                         }
//                     } while (opt != 0);

//                 }
//                 else System.out.println("\nInvalid ID or password!\n");
//             }
//             else if (choice == 2) {
//                 System.out.print("\nEnter 1 to view your profile \nEnter 2 to pay your bill: ");
//                 int option = input.nextInt();
//                 Customer c1 = new Customer();
//                 if (option == 1)
//                     //c1.customerProfile();
//                 //else
//                     c1.payBill(); 
//             }
//         } while (choice != 0);
//     }
// }
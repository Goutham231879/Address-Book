
import java.util.*;
public class Main{


 public static void main(String[] args) {
        Address book = new Address();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Contact Book Menu =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    book.addContact();
                    break;
                case 2:
                    book.viewContact();
                    break;
                case 3:
                    book.searchContact();
                    break;
                case 4:
                    book.deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting Contact Book.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

}
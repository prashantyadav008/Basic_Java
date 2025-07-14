import java.util.Scanner;

public class Basic_Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Forloop Concept
        for (int i = 1; i <= 2; i++) {
            System.out.print("Enter Your Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();

            sc.nextLine();

            System.out.println("Name is: " + name + "\t Balance is: " + balance);
        }

        // While Loop Concept
        int choice;
        while (true) {
            System.out.println("\n---- Bank Menu ----");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Registration selected.");
            } else if (choice == 2) {
                System.out.println("Login selected.");
            } else if (choice == 3) {
                System.out.println("Exiting... Bye!");
                break; // loop break
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

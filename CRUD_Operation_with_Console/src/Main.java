import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserService userService = new UserService();
        boolean run = true;

        while (run) {
            System.out.println("\n📚 MENU:");
            System.out.println("1. Add User");
            System.out.println("2. View All Users");
            System.out.println("3. Update User Email");
            System.out.println("4. Delete User");
            System.out.println("5. View Single Users");
            System.out.println("6. Exit");

            System.out.println("\nEnter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // buffer clear

            switch (choice) {
                case 1:
                    userService.addUser(sc);
                    break;
                case 2:
                    userService.viewUsers();
                    break;
                case 3:
                    userService.updateUser(sc);
                    break;
                case 4:
                    userService.deleteUser(sc);
                    break;
                case 5:
                    userService.viewSingleUser(sc);
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("Invalid Choice!");

            }
        }
        sc.close();
    }
}
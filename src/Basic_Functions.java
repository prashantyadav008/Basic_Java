import java.util.Scanner;

public class Basic_Functions {
    static String name = "";
    static int age = 0;
    static String email = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        addUser(sc);
        showUser();

        System.out.println("You want to update the detail (Yes for true / No for false): ");
        boolean updateStatus = sc.nextBoolean();

        if (updateStatus) {
            updateUser(sc);
            showUser();
        }
    }

    public static void addUser(Scanner sc) {
        System.out.println("Add your Details -->> ");
        System.out.println("Enter your Name: ");
        name = sc.nextLine();

        System.out.println("Enter your Age: ");
        age = sc.nextInt();

        sc.nextLine(); // buffer clear

        System.out.println("Enter your Email: ");
        email = sc.nextLine();

        System.out.println("User added successfully!\n");
    }

    public static void updateUser(Scanner sc) {
        System.out.println("Update your Details -->> ");
        System.out.println("Enter your Age: ");
        age = sc.nextInt();

        sc.nextLine(); // buffer clear

        System.out.println("Enter your Email: ");
        email = sc.nextLine();

        System.out.println("User added successfully!\n");
    }


    public static void showUser() {
        System.out.println("User Detail --->>>> ");

        System.out.println("Your Name is: " + name);
        System.out.println("Your Age is: " + age);
        System.out.println("Your Email is: " + email);
    }
}


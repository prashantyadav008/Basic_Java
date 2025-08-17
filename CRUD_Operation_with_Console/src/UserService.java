import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    private final ArrayList<User> userList = new ArrayList<>();
    private int userIdCounter = 1;

    public void addUser(Scanner sc) {
        System.out.println("Add User Details ---->>>");

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your Age: ");
        int age = sc.nextInt();

        sc.nextLine(); // buffer clear

        System.out.println("Enter your Email: ");
        String email = sc.nextLine();

        System.out.println("Enter your Password: ");
        String password = sc.nextLine();

        User newUser = new User(userIdCounter, name, age, email, password);
        userList.add(newUser);
        System.out.println("User Added Successfully!, and User Id is: " + userIdCounter);
        userIdCounter++;
    }

    public void viewUsers() {
        if (userList.isEmpty()) {
            System.out.println("No User Available!");
            return;
        }

        System.out.println("All Users --->>>");
        for (User user : userList) {
            user.displayUser();
            System.out.println("\n\n--------------------------\n");
        }
    }

    public void updateUser(Scanner sc) {
        System.out.println("Enter User Id to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // buffer clear

        for (User user : userList) {
            if (user.getId() == id) {

                System.out.println("Enter new Name: ");
                String name = sc.nextLine();
                user.setName(name);

                System.out.println("Enter Age: ");
                int _age = sc.nextInt();
                user.setAge(_age);

                sc.nextLine(); // buffer clear

                System.out.println("Enter new Email: ");
                String _email = sc.nextLine();
                user.setEmail(_email);

                System.out.println("Enter new Password: ");
                String password = sc.nextLine();
                user.setPassword(password);

                System.out.println("Details Update Successfully for Id: " + id);
                return;
            }
        }

        System.out.println("User Id not Exits!");

    }

    public void deleteUser(Scanner sc) {
        System.out.println("Enter User Id to delete: ");
        int id = sc.nextInt();
        sc.nextLine(); // buffer clear

        for (User user : userList) {
            if (user.getId() == id) {
                userList.remove(user);
                System.out.println("User Deleted Successfully!");
                return;
            }
        }

        System.out.println("User Id not Exits!");


    }

    public void viewSingleUser(Scanner sc) {
        System.out.println("Enter User Id to View: ");
        int id = sc.nextInt();
        sc.nextLine(); // buffer clear

        for (User user : userList) {
            if (user.getId() == id) {
                user.displayUser();
                return;
            }
        }

        System.out.println("User Id not Exits!");


    }
}

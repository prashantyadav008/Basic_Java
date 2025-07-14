import java.util.Scanner;

class User {
    public String name;
    protected String email;

    public User(String _name, String _email) {
        this.name = _name;
        this.email = _email;
    }

    public void displayUser() {
        System.out.println("Name is: " + name);
        System.out.println("Email is: " + email);
    }
}

public class ClassObjectConstructor {
    public static void main(String[] args) {
        System.out.println("Hello Prashant");

        User user = new User("Prashant Yadav", "prashant@email.com");
        user.displayUser();

        user.name = "Aditya Yadav";
        user.email = "aditya@email.com";
        user.displayUser();


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        user.name = sc.nextLine();

        System.out.print("Enter your Email: ");
        user.email = sc.nextLine();

        user.displayUser();
    }
}

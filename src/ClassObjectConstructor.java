import java.util.Scanner;

class UserDetail {
    public String name;
    protected String email;

    public UserDetail(String _name, String _email) {
        this.name = _name;
        this.email = _email;
    }

    public void displayUserDetail() {
        System.out.println("Name is: " + name);
        System.out.println("Email is: " + email);
    }
}

public class ClassObjectConstructor {
    public static void main(String[] args) {
        System.out.println("Hello Prashant");

        UserDetail user = new UserDetail("Prashant Yadav", "prashant@email.com");
        user.displayUserDetail();

        user.name = "Aditya Yadav";
        user.email = "aditya@email.com";
        user.displayUserDetail();


        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Name: ");
            user.name = sc.nextLine();

            System.out.print("Enter your Email: ");
            user.email = sc.nextLine();

            user.displayUserDetail();

            sc.nextLine();
        }

    }
}

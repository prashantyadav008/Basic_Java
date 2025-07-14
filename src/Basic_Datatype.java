import java.util.Scanner;

public class Basic_Datatype {

    public static void main(String[] args) {
        String name;
        String email;
        String password;
        int age;
        double balance;
        String role;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        name = sc.nextLine();

        System.out.print("Enter your Age: ");
        age = sc.nextInt();

        System.out.print("Enter your Balance: ");
        balance = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter your Role: ");
        role = sc.nextLine();

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("balance: " + balance);
        System.out.println("role: " + role);
    }
}

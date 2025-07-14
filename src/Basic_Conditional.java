import java.util.Scanner;

public class Basic_Conditional {
    public static void main(String[] args) {
        int age;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your Age: ");
        age = sc.nextInt();


        if (age > 17) {
            System.out.println("You're eligible for Vote!");
        } else {
            System.out.println("You're not eligible for Vote!");
        }
    }
}

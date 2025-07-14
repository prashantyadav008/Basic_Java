public class Main {
    public static void main(String[] args) {
        String name = "Prashant Yadav";
        int age = 25;

        System.out.println("Hello "+ name);

        if(age >= 18){
            System.out.println("You are Eligible for Voting");
        } else{
            System.out.println("You are not Eligible for Voting");
        }

        for (int i=0;i<5;i++){
            System.out.println("Printing Name is: "+name);
        }

    }
}
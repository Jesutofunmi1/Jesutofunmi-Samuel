package Chapter2;

import java.util.Scanner;

public class MyProfile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = String.valueOf(input.nextInt());

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Enter your date of birth: ");
        int dob = input.nextInt();
    }

}

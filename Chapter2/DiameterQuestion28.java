package Chapter2;

import java.util.Scanner;

public class DiameterQuestion28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int radius = input.nextInt();


        int diameter = 2*radius;

        System.out.println("Diameter is "+diameter);

        double circumference = 2*3.14159*radius;

        System.out.println("Circumference "+circumference);

        double area = 3.14159*radius*radius;

        System.out.println("Area is "+area);



    }
}


package Chapter4;

import java.util.Scanner;

public class TriangleAsterisks {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j< i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
            }

        }


    }


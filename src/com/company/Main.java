package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number to multiply number up to 10: ");
        if (scanner.hasNextInt()) {
            int multiplier = 0;
            int num = scanner.nextInt();
            scanner.nextLine();
            System.out.println("The multiplied numbers of " + num + " are: ");
            for (int i = 0; i <= 10; i++) {
                int answer = num * multiplier;
                System.out.println(num + " X " + multiplier + " = " + answer );
                multiplier++;
            }
        } else {
            System.out.println("Invalid input!");
        }
    }
}

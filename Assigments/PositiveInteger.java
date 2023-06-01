/*Write a program that reads a positive integer, n, from the user and then displays the sum of all of the integers from 1 to n. The sum of the first n positive integers can be computed using the formula: sum = (n)(n + 1)/2*/

import java.util.Scanner;

 class PositiveInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        int sum = (n * (n + 1)) / 2;

        System.out.println("The sum of all integers from 1 to " + n + " is: " + sum);

        scanner.close();
    }
}

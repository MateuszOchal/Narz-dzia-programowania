package pl.sda.ptools;

import java.util.Scanner;

public class MyFirstIfs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number A: ");
        int a = scanner.nextInt();
        System.out.print("Please enter number B: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("A is  than B");
        } else if (a < b) {
            System.out.println("A is  than B");
        } else {
            System.out.println("A is equal to B");
        }
    }
}
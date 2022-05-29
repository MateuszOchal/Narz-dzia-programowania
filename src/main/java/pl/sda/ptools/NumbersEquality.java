package pl.sda.ptools;

import java.util.Scanner;

public class NumbersEquality {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter  number A: ");
    int numberA = scanner.nextInt();
    System.out.print("Please enter  number B: ");

    int numberB = scanner.nextInt();
    if (numberA > numberB) {
        System.out.println("number A is bigger than number B");
    } else if (numberA == numberB) {
        System.out.println("number B is equal to number A");
    } else {
        System.out.println("number B is bigger than number A");
    }

}
}



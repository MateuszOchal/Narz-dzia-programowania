package pl.sda.ptools;

import java.util.Scanner;

public class aawaa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter  number A: ");
        int numberA = scanner.nextInt();
        System.out.print("Please enter  number B: ");

        int numberB = scanner.nextInt();
        if (numberA > numberB) {
            printMessageWithNewLine("a is  than b");
        } else if (numberA == numberB) {
            printMessageWithNewLine("number Bo number A");
        } else {
            printMessageWithNewLine("number  than number A");
        }

    }

    private static void printMessageWithNewLine(String message) {
        System.out.println(message);
    }
}


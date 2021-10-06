package com.company;

import java.util.Scanner;

public class No2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input N number : ");
        int number = scanner.nextInt();

        System.out.println((int) sumOf(number));
    }

    private static double sumOf(int inputNumber) {
        return (double) inputNumber / 2 * (inputNumber + 1);
    }
}

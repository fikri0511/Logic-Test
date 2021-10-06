package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        System.out.print("Input First Word : ");
        String firstWord = scanner.nextLine();

        System.out.print("Input Second Word : ");
        String secondWord = scanner.nextLine();

        System.out.println(isAnagram(firstWord, secondWord));
    }

    private static Boolean isAnagram(String firstWord, String secondWord) {
        String firstWordNoSpace = firstWord.replaceAll("\s", "");
        String secondWordNoSpace = secondWord.replaceAll("\s", "");

        if (firstWordNoSpace.length() != secondWordNoSpace.length()) {
            return false;
        } else {
            char[] arrayFirstWord = firstWordNoSpace.toLowerCase().toCharArray();
            char[] arraySecondWord = secondWordNoSpace.toLowerCase().toCharArray();

            Arrays.sort(arrayFirstWord);
            Arrays.sort(arraySecondWord);
            return Arrays.toString(arrayFirstWord).equals(Arrays.toString(arraySecondWord));
        }

    }
}

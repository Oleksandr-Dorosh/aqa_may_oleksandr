package com.word;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        scanner.close();

        string minUniqueCharsWord = new string();
        String result = minUniqueCharsWord.findWordWithMinUniqueChars(inputString);
        System.out.println(result);
    }
}
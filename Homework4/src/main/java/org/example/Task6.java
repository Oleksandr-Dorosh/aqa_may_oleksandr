package org.example;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x<0){
            System.out.println("Вы ввели"+":" +  " Отрицательное число " + x);
        }

        if (x==0){
            System.out.println("Вы ввели 0");
        }
        if (x>0){
            System.out.println("Вы ввели"+":" +  " Положительное число " + x);
        }

        }
    }


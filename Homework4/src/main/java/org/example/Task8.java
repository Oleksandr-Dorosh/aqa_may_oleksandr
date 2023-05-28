package org.example;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();

        int numb1 =x/10;
        int numb2= x%10;

        int abc= numb1*numb2;

        if (x>abc) {
            System.out.println(x + "-" + "Больше чем произведение его цифр");}
        else if (x<abc) {
                System.out.println(x + "-" + "Меньше чем произведение его цифр");
            } else {
            System.out.println("Число"+ "-" + x + "равно произведению его цифр");
        }
            }
        }




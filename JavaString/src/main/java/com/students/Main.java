package com.students;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите фамилию студента: ");
            String lastName = scanner.nextLine();

            System.out.print("Введите оценку студента: ");
            int grade = scanner.nextInt();

            scanner.nextLine();

            System.out.print("Введите название предмета: ");
            String subject = scanner.nextLine();

            printFormattedString(lastName, grade, subject);

            scanner.close();
        }

        public static void printFormattedString(String lastName, int grade, String subject) {
            String formattedString = String.format("Студент %-15s получил %3d по %10s.", lastName, grade, subject);
            System.out.println(formattedString);
        }
}


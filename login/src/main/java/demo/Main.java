package demo;

import realization.UserValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter login:");
        String login = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        System.out.println("Confirm password:");
        String confirmPassword = scanner.nextLine();

        boolean isValid;
        isValid = UserValidation.validateUser(login, password, confirmPassword);
        System.out.println(isValid);

        scanner.close();
    }
}

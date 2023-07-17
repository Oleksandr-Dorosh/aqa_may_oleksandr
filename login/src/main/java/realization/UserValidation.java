package realization;

public class UserValidation {
    public static boolean validateUser(String login, String password, String confirmPassword) {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (login == null || !login.contains("_") || login.length() >= 20) {
            throw new WrongLoginException("Invalid login");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.contains("_") || !password.contains("!") ||
                password.length() >= 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Invalid password");
        }
    }
}

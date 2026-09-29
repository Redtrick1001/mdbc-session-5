package passwordchecker;

public class PasswordChecker {
    public boolean checkPassword(String password) {
        if (password.length() < 8) return false;
        // this regex check if there is a number in the string
        if (!password.matches(".*[0-9].*")) return false;
        // this regex checks if there is a letter in the string
        if (!password.matches(".*[a-zA-Z].*")) return false;

        return true;
    }
}

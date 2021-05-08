package dayFiveWorkOne.core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {

    public static boolean emailChecker(String email) {
        String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean passwordChecker(String password) {
        if (password.isEmpty() || password.length() < 6) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean firstNameChecker(String firstName) {
        if (firstName.isEmpty() || firstName.length() <= 2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean lastNameChecker(String lastname) {
        if (lastname.isEmpty() || lastname.length() <= 2) {
            return false;
        } else {
            return true;
        }
    }


}

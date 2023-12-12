package loginValidations;
/**
 *
 * @author chris
 */
public class PasswordValidator {

    public static int validate(String p1, String p2) {

        int response = 0;

        if (!p1.equals(p2) && response == 0) {
            response = 1;
        }

        if (p1.isEmpty() || p1 == null) {
            response = 2;
        }

        if (p1.length() < 8 && response == 0) {
            response = 3;
        }

        if (response == 0) {
            response = 4;
            for (int i = 0; i < p1.length(); i++) {
                if ((p1.charAt(i) >= 48 && p1.charAt(i) <= 57)) {
                    response = 0;
                }
            }
        }

        if (response == 0) {
            response = 5;
            for (int i = 0; i < p1.length(); i++) {
                if ((p1.charAt(i) >= 65 && p1.charAt(i) <= 90)) {
                    response = 0;
                }
            }
        }

        if (response == 0) {
            response = 6;
            for (int i = 0; i < p1.length(); i++) {
                if ((p1.charAt(i) >= 97 && p1.charAt(i) <= 122)) {
                    response = 0;

                }
            }

        }

        return response;
        
    }

}

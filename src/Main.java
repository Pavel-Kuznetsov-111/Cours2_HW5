import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        try {
            inputDataUser(sVoboda, 234457eP, 46676rhU);
        } catch (WrongPasswordExpetion | WrongLoginExpetion) {
            System.out.println(e.getMessage());
        }
    }

    public class

    void InputDataUser(String login, String password, String confirmPassword) throws WrongLoginExpetion, WrongPasswordExpetion {
        String regexLogin = "^[a-z0-9_]{0,20}$";
        Pattern patternLogin = Pattern.compile(regexLogin);
        Matcher matcherLogin = patternLogin.matcher(login);
        if (!matcherLogin.matches()) {
            throw new WrongLoginExpetion();
        }
        if (!matcherPassword.matcher()) {
            throw new WrongPasswordExpetion();
        }if (!password.equals(confirmPassword)){
            throw new WrongPasswordExpetion();
        }

    }
}
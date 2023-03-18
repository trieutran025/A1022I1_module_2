package ss18_string_regex.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String PHONE_REGEX =  "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";
    public ValidatePhone(){}
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

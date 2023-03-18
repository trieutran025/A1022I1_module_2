package ss18_string_regex.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static final String NAME_CLASS_REGEX = "^[A-P-C][0-9]{4}[G-H-I-K-L-M]$";
    public ValidateNameClass(){};
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(NAME_CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

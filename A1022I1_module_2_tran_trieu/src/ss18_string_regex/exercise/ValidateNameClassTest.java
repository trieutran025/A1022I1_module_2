package ss18_string_regex.exercise;

public class ValidateNameClassTest {
    private static final String[] validNameClass = new String[] {"A1022I","A1122H","C0922H","A12345G"};
    private static final String[] invalidNameClass = new String[]{"P1022I1","B100154K1","C1234G"};
    public static void main(String[] args) {
        ValidateNameClass validateNameClass = new ValidateNameClass();
        for(String nameClass : validNameClass){
            boolean isValid = validateNameClass.validate(nameClass);
            System.out.println("Name Class is " + nameClass + " is valid: "+isValid);
        }
        for(String nameClass : invalidNameClass){
            boolean isValid = validateNameClass.validate(nameClass);
            System.out.println("Name Class is " + nameClass + " is valid: "+isValid);
        }
    }
}

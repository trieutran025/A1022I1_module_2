package ss18_string_regex.exercise;

public class ValidatePhoneTest {
    private static final String[] validPhone = new String[] {"(84)-(0978489648)","(84)-(0123546963)","(a8)-(0521244555664)"};
    private static final String[] invalidPhone = new String[]{"(23)-(1254546321)","(333)-(854645465455)"};
    public static void main(String[] args) {
        ValidatePhone validatePhone = new ValidatePhone();
        for(String phone : validPhone){
            boolean isValid = validatePhone.validate(phone);
            System.out.println("Phone is" + phone + "is valid: "+isValid);
        }
        for(String phone : invalidPhone){
            boolean isValid = validatePhone.validate(phone);
            System.out.println("Phone is" + phone + "is valid: "+isValid);
        }
    }
}

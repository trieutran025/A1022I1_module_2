package ss15_exception.exercise;

public class IllegalTriangleException extends Exception {
    private int a;
    private int b;
    private int c;

    public IllegalTriangleException(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getMessage() {
        if (a < 0 || b < 0 || c < 0) {
            return "Do not enter negative numbers";
        } else if (a + b < c || a + c < b || b + c < a) {
            return "The sum of any two sides must be greater than the other";
        } else {
            return "";
        }
    }
}

package ss03_array_and_method.Method.pratice;

public class Demo {
    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static int sum1(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
//        sum(5, 6);
        int result = sum1(1, 2);
//        int result =sum(1,2);//method is not return value
        System.out.println(result);
    }
}

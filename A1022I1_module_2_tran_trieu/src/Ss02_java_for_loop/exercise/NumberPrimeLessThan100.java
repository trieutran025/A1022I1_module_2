package Ss02_java_for_loop.exercise;

public class NumberPrimeLessThan100 {
    public static void main(String[] args) {
        int number = 2;
        boolean check = true;
        while (number < 100) {
             check = true;
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.print(number + "\t");
            }
            number++;
        }
    }
}

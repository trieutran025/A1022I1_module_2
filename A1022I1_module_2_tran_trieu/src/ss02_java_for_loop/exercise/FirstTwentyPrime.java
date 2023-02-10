package ss02_java_for_loop.exercise;

public class FirstTwentyPrime {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (count != 20) {
            boolean check = true;// after each check loop will change
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
                count++;
            }
            number++;//Number will change
        }
    }
}

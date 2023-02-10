package ss02_java_for_loop.pratice;

import java.util.Scanner;

public class sumFact {
    public static void main(String[] args) {
        long n, x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextLong();
        n = sc.nextLong();
        long temp = 1;
        double S = 1;
        for (int i = 1; i <=n ; i++) {
            temp*=i;
            S+=Math.pow(x,i)/temp;
        }
        System.out.print(S);
    }
}

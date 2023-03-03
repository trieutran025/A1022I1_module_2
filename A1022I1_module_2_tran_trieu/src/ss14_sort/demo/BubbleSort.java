package ss14_sort.demo;

import java.util.Arrays;

public class BubbleSort {
    public static int[] sort(int[] myArr) {
        boolean check = true;
        for (int i = 1; i < myArr.length && check; i++) {
            check = false;
            for (int j = 0; j < myArr.length - i; j++) {
                if (myArr[j] > myArr[j + 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                    check = true;
                }
            }
        }
        return myArr;
    }

    public static void main(String[] args) {
        int a[] = {11, 5, 3, 4, 6};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}

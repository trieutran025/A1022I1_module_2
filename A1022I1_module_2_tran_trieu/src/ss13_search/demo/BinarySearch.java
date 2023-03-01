package ss13_search.demo;

import java.util.Arrays;

public class BinarySearch {
    public static int search(int []array,int value){
        int left =0;
        int right =array.length-1;
        while (left<=right){
            int mid = (left + right)/2;
            if(array[mid]==value){
                return mid;
            } else if (array[mid]>value) {
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(myArray,4));
        System.out.println(Arrays.binarySearch(myArray,4));
    }
}

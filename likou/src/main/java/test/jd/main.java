package test.jd;

import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] arr = {8,4,9,7,5};
        int temp = 0;
        for(int i = 0; i< arr.length-1 ;i++){

            if (arr[i] > arr[i +1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

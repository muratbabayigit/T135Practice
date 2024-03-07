package day06;

import java.util.Arrays;

public class M03_Arrays {
    public static void main(String[] args) {
        /*
        //bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6
         */

        int [] arr={2,3,4,-5,-12,21,36,41,-128};
        for (int i = 0; i < arr.length; i++) {
            arr[i]  *=  -1;
        }
        System.out.println(Arrays.toString(arr));


    }
}

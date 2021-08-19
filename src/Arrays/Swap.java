package Arrays;

import java.util.Arrays;

public class Swap {
//    public static int max(int[] arr){
//        int max=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return max;
//    }
    public static int[] swap(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end) {

                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;


            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        swap(arr);
        System.out.println(Arrays.toString(arr));
//        System.out.println(max(arr));
    }
}

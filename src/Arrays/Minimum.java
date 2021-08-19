package Arrays;

public class Minimum {
    public static int mini(int[] arr){
       int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int[] arr={100,4,7,2,9};
        System.out.println(mini(arr));
    }
}

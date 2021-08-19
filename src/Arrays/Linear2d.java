package Arrays;
import java.util.Arrays;
public class Linear2d {
    public static int[] search2d(int[][] arr,int val){
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col <arr[0].length ; col++) {
                if(arr[row][col]==val){
                    return new int[]{row,col};
                }

            }

        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] arr={
                {23,7,87,54},
                {7,6,34,98},
                {52,76},
                {1,2,3,44}
        };
        int val=76;
        int[] ans=search2d(arr,val);
        System.out.println(Arrays.toString(ans));
    }
}

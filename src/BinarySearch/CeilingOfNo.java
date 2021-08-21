package BinarySearch;

public class CeilingOfNo {
    public static int binary(int[] letters,int ele){
        int start=0;
        int end= letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(ele==letters[mid]){
                return mid;
            }
            else if(ele>letters[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return letters[start];
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int ans=binary(arr,15);
        System.out.println(ans);
    }
}

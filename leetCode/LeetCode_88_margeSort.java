package leetCode;

public class LeetCode_88_margeSort {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,0,0,0,0};
       // 4=8-3-1
        int []arr1 = {6,7,8,9};
         merge(arr,arr1,arr.length- arr1.length,arr1.length);
         for(int i:arr){
             System.out.print(i+" ");
         }

    }

    private static void merge(int[] arr, int[] arr1, int m, int n) {
        int r1=m-1;
        int r2=n-1;
        int w=m+n-1;

       while(r1>=0 && r2>=0){
           if(arr[r1]<arr1[r2]){
               arr[w--]=arr1[r2--];
           } else
               arr[w--]=arr[r1--];
       }
       while(r1>=0){
           arr[w--]=arr[r1--];
       }
       while(r2>=0){
           arr[w--]=arr1[r2--];
       }

    }
}

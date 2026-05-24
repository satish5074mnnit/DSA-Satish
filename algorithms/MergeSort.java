package algorithms;

public class MergeSort {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        mergeSort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void mergeSort(int[] arr, int st, int end) {
        if(st>=end){
            return;
        }

        int mid = st+(end-st)/2;

        mergeSort(arr,st,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,st,mid,end);
    }


    private static void merge(int[] arr, int st, int mid, int end) {
        int merged[]= new int[end-st+1];

        int i=st;
        int j=mid+1;
        int k=0;

        // for merging till aray at least one of the array is valid

        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                merged[k++]=arr[i++];
            } else {
                merged[k++]=arr[j++];
            }
        }

        while(i<=mid){
            merged[k++]=arr[i++];
        }
        while(j<=end){
            merged[k++]=arr[j++];
        }

        for( i=0,j=st;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }

}

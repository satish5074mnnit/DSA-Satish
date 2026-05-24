package leetCode;

public class leecode_26_remove_duplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,2,4,4,6,6,8,8};
        int k=removeDuplicates(arr);
        System.out.println( k);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int removeDuplicates(int[] arr) {
        if(arr==null || arr.length==0) return 0;


        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                   i++;
                   arr[i]=arr[j];
            }
        }
        return i+1;

    }
}

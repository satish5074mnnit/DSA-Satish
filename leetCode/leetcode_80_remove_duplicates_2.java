package leetCode;

public class leetcode_80_remove_duplicates_2 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,3,4,4,5,5,6,7,7,7};
        int k=removeDuplicates2(arr);
        System.out.println(k);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeDuplicates2(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        if(nums.length<=2){return nums.length;}

        int k=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k++]=nums[i];
            }
        }

        return k;
    }
}

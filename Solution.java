class Solution {
    public int[] sortedSquares(int[] nums) {
        int li=0;
        int hi=nums.length-1;
        int[] nums1=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];}  
        for(int i=nums.length-1;i>=0;i--){
            if(nums[li]>nums[hi]){
                nums1[i]=nums[li];
                li++;
            }
            else{
                nums1[i]=nums[hi];
                hi--;
            }
        }
        return nums1;
    }
}

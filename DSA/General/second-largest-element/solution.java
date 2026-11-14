class Solution {
    public int secondLargestElement(int[] nums) {
        if(nums == null || nums.length<2){
            return -1;
        }
        int num1 = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;
         
        for(int i =0;i<nums.length;i++){
            if(nums[i]> num1){
                num2 = num1;
                num1 = nums[i];
            }
            else if(nums[i]>num2 && nums[i]<num1){
                num2 = nums[i];
            }
        }
        return (num2 == Integer.MIN_VALUE) ? -1 : num2;

    }
}
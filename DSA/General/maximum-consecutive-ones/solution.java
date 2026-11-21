class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        for(int i =0;i<nums.length;i++){
            int total=0;
            while(i<nums.length && nums[i]==1){
                total++;
                i++;
            }
            if(total>count){
                count = total;
            }
        }
        return count;
        
    }
}
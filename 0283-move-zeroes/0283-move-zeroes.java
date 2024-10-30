class Solution {
    public void moveZeroes(int[] nums) {
        int rp = 0;
        int wp = 0;

        for(rp=0; rp<nums.length; rp++){
            if(nums[rp]!=0){
                nums[wp]=nums[rp];
                wp++;
            }
        }
        while(wp<nums.length){
            nums[wp]=0;
            wp++;
        }
        
    }
}
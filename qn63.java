class Solution {
    public int maxSubArray(int[] nums) {
        int msf=nums[0];
        int men=0;
        for(int i=0;i<nums.length;i++){
            men=men+nums[i];
            if(msf<men)
                msf=men;
            if(men<0)
                men=0;
        }
        return msf;
    }
}
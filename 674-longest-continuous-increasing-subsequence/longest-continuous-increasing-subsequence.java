class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=0,n=nums.length,ma=-1;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                c++;
            }
            else
            {
                ma=Math.max(ma,c);
                c=0;
            }
        }
         ma=Math.max(ma,c);
        return ma+1;
    }
}
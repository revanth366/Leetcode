class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=-1,zc=0;
        for(int j=0;j<n;j++)
        {
            if(nums[j]==1)
            {
                zc++;
            }
            else
            {
                zc=0;
            }
            max=Math.max(max,zc);
        }
        return max;
    }
}
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0,max=-1,zc=0;
        for(int j=0;j<n;j++)
        {
            if(nums[j]==0)
            {
                zc++;
            }
            while(zc>k)
            {
                if(nums[i]==0)
                {
                    zc--;
                }
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}
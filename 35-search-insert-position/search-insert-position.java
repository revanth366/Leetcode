class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int l=0,r=n-1;
        if(nums[r]<target)
        {
            return n;
        }
        while(l<=r)
        {
            int m=(l+r)/2;
            if(nums[m]==target)
            {
                return m;
            }
            if(nums[m]<target)
            {
                // if(nums[m]+1==target)return m+1;
                l=m+1;
            }
            else
            {
                // if(nums[m]-1==target)return m-1;
                r=m-1;
            }
        }
        return l;
    }
}
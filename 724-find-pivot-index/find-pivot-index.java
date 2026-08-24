class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int s=0;
        int[] a=new int[n+1];
        a[0]=0;
        for(int i=0;i<n;i++)
        {
            s=s+nums[i];
            a[i+1]=s;
        }
        for(int i=0;i<n;i++)
        {
            int rs=a[i];
            int ls=a[n]-a[i+1];
            if(ls==rs)
            return i;
        }
        return -1;
    }
}
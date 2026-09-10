class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int[] a=new int[n+1];
        a[0]=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            a[i+1]=sum;
            // System.out.println(sum);
        }
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==a[n]-a[i+1])
            return i;
        }
        return -1;
    }
}
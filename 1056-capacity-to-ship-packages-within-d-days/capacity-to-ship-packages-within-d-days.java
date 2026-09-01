class Solution {
    public int shipWithinDays(int[] nums, int days) {
        int n=nums.length;
        int sum=0,max=-1;
        for(int i:nums)
        {
            sum+=i;
            max=Math.max(max,i);
        }
        int l=max;
        int r=sum;
        while(l<r)
        {
            int m=(l+r)/2;
            if(canShip(nums,days,m))
            {
                r=m;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }

    private boolean canShip(int[] nums ,int d,int c)
    {
        int n=nums.length;
        int dn=0;
        int cw=0;
        for(int i:nums)
        {
            if(cw+i<=c)
            {
                cw+=i;
            }
            else
            {
                dn++;
                cw=i;
            }
        }
        if(cw!=0)
        {
            dn++;
        }
        return dn<=d;
    }
}
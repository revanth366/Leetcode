class Solution {
    public int[] corpFlightBookings(int[][] boo, int n) {
        int[] a=new int[n];
        int[] da=new int[n+1];
        int[] dap=new int[n+1];
        for(int i=0;i<boo.length;i++)
        {
            int l=boo[i][0];
            int r=boo[i][1];
            int re=boo[i][2];
            da[l-1]+=re;
            da[r]-=re;
        }
        int prefix=0;
        for(int i=0;i<n;i++)
        {
            prefix+=da[i];
            a[i]=prefix;
        }

        return a;
    }
}
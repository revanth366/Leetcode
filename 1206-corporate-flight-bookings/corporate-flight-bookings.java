class Solution {
    public int[] corpFlightBookings(int[][] boo, int n) {
        int[] a=new int[n];
        for(int i=0;i<boo.length;i++)
        {
            int l=boo[i][0];
            int r=boo[i][1];
            int re=boo[i][2];
            for(int j=l-1;j<r;j++)
            {
                a[j]=a[j]+re;
            }
        }
        return a;
    }
}
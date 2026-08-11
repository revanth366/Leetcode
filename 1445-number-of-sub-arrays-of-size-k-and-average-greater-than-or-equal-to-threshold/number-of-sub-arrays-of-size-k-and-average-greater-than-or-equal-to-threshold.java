class Solution {
    public int numOfSubarrays(int[] arr, int k, int thr) {
        int s=0;
        int i=0,c=0;
        int n=arr.length;
        for(int j=0;j<n;j++)
        {
            s=s+arr[j];
            if(j>=k-1)
            {
                int te=s/k;
                if(te>=thr)
                {
                    c++;
                }
                s=s-arr[i];
                i++;
            }

        }
        return c;
    }
}
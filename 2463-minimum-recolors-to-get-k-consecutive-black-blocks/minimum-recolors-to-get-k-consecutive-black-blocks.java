class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length(),i=0;
        char[] ch=blocks.toCharArray();
        int min=10000,c=0;
        for(int j=0;j<n;j++)
        {
            if(ch[j]=='W')
            {
                c++;
            }
            if(j>=k-1)
            {
                min = Math.min(min, c);
                if(ch[i]=='W')
                {
                    c--;
                }
                i++;
                // min=Math.min(min,c);
            }
            // if (j >= k - 1)
                

        }
        return min;
    }
}
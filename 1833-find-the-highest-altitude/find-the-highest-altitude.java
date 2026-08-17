class Solution {
    public int largestAltitude(int[] gain) {
       int c=0;
        int mac=0;
        for(int i:gain)
        {
            c=c+i;
            mac=Math.max(mac,c);
        }
        return mac;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> m=new HashMap<>();
        int n=s.length(),i=0,max=0;
        for(int j=0;j<n;j++)
        {
            char c=s.charAt(j);
            while(m.containsKey(c))
            {
                char cs=s.charAt(i);
                m.put(cs,m.get(cs)-1);
                if(m.get(cs)==0)
                {
                    m.remove(cs);
                }
                i++;
            }
            
            m.put(c,1);
            max=Math.max(max,m.size());
        }
        return max;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> m=new HashSet<>();
        int n=s.length(),i=0,max=0;
        for(int j=0;j<n;j++)
        {
            char c=s.charAt(j);
            while(m.contains(c))
            {
                char cs=s.charAt(i);
                    m.remove(cs);
                i++;
            }
            
            m.add(c);
            max=Math.max(max,m.size());
        }
        return max;
    }
}
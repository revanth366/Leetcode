class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int v=0;
        int c=0;
        for(char ch:mp.keySet())
        {
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                v=Math.max(v,mp.getOrDefault(ch,0));
            }
            else
            {
                c=Math.max(c,mp.getOrDefault(ch,0));
            }
        }
        return v+c;
    }
}
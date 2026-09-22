class Solution {
    public String predictPartyVictory(String s) {
        ArrayDeque<Integer> R=new ArrayDeque<>();
        ArrayDeque<Integer> D=new ArrayDeque<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='R')
            {
                R.add(i);
            }
            else
            {
                D.add(i);
            }
        }
        while(!R.isEmpty()&&!D.isEmpty())
        {
            int r=R.poll();
            int d=D.poll();
            if(r<d)
            {
                R.add(r+n);
            }
            else
            {
                D.add(d+n);
            }
        }
        if(D.isEmpty())
        return "Radiant";
        return "Dire";
    }
}
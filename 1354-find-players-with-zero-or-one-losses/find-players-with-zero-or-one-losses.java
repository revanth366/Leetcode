class Solution {
    public List<List<Integer>> findWinners(int[][] mat) {
        Set<Integer> s=new LinkedHashSet<>();
        HashMap<Integer,Integer> m=new HashMap<>();
        List<List<Integer>> l=new ArrayList<>();
        int n=mat.length;
        for(int i=0;i<n;i++)
        {
            m.put(mat[i][1],m.getOrDefault(mat[i][1],0)+1);
            s.add(mat[i][0]);
            s.add(mat[i][1]);
        }
        // int[] wa=new int[n];
        List<Integer> wa=new ArrayList<>();
        List<Integer> la=new ArrayList<>();
        //  wl=0;
        // int[] la=new int[n];
        // int ll=0;
        for(int i:s)
        {
            if(m.containsKey(i))
            {
                if(m.get(i)==1)
                {
                    la.add(i);
                }
            }
            else
            {
                wa.add(i);
            }
        }
        Collections.sort(wa);
        Collections.sort(la);
        l.add(wa);
        l.add(la);
        return l;

    }
}
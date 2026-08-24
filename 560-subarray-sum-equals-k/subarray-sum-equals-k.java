class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int c=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
           
            if(m.containsKey(sum-k))
            {
                c=c+m.get(sum-k);
            }
             m.put(sum,m.getOrDefault(sum,0)+1);
        }
        // for(int i:m.keySet())
        // {
            
        // }
        return c;
    }
}
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int c=0;
        HashMap<Integer,Integer> m=new HashMap<>();
        m.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
           int rem = ((sum % k) + k) % k;
            if(m.containsKey(rem))
            {
                c=c+m.get(rem);
            }
             m.put(rem,m.getOrDefault(rem,0)+1);
        }
        return c;
    }
}
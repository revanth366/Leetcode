class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer,Integer> m=new HashMap<>();
         int n=nums.length;
         int k=target;
         int[] rs=new int[2];
         for(int i=0;i<n;i++)
         {
            if(m.containsKey(k-nums[i]))
            {
                rs[0]=i;
                rs[1]=m.get(k-nums[i]);
                return rs;
            }
            m.put(nums[i],i);
         }
         return rs;
    }
}
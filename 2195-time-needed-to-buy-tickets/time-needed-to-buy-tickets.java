class Solution {
    public int timeRequiredToBuy(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        ArrayDeque<Integer> q=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            q.add(i);
        }
        while(nums[k]>0)
        {
            int f=q.poll();
            nums[f]-=1;
            if(nums[f]>0)
            q.add(f);
            ans++;
        }
        return ans;
    }
}
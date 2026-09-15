class Solution {
    public int[] dailyTemperatures(int[] tem) {
        ArrayDeque<Integer> s=new ArrayDeque<>();
        int n=tem.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty()&&tem[i]>tem[s.peek()])
            {
                ans[s.peek()]=i-s.peek();
                s.pop();
            }
            s.push(i);
        }
        return ans;
    }
}
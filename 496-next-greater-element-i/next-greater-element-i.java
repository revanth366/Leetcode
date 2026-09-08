class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayDeque<Integer> s=new ArrayDeque<>();
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:nums2)
        {
            while(!s.isEmpty()&&s.peek()<i)
            {
                int r=s.pop();
                m.put(r,i);
            }
            s.push(i);
        }
        for(int i:s)
        {
            m.put(i,-1);
        }
        int[] a=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            a[i]=m.get(nums1[i]);
        }
        return a;
    }
}
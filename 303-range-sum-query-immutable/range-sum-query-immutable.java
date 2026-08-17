class NumArray {
    int[] a;
    public NumArray(int[] nums) {
        a=new int[nums.length];
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s=s+nums[i];
            a[i]=s;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0)
        {
            return a[right];
        }
        else
        {
            return a[right]-a[left-1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
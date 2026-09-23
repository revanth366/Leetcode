class Solution {
    public int evalRPN(String[] nums) {
        ArrayDeque<Integer> s=new ArrayDeque<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
           if (nums[i].length() == 1 && (nums[i].charAt(0) == '+' || nums[i].charAt(0) == '-' || nums[i].charAt(0) == '/' || nums[i].charAt(0) == '*'))
            {
               int ki=s.pop();
               int pi=s.pop();
              switch (nums[i]) {
                    case "+": s.push(pi + ki); break;
                    case "-": s.push(pi - ki); break;
                    case "*": s.push(pi * ki); break;
                    case "/": s.push(pi / ki); break;
                }
            }
            else
            {
                int a=Integer.parseInt(nums[i]);
                s.push(a);
            }
        }
        return s.peek();
    }
}
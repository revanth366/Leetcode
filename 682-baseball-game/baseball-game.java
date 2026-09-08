class Solution {
    public int calPoints(String[] ops) {
        ArrayDeque<Integer> s=new ArrayDeque<>();
        for(int i=0;i<ops.length;i++)
        {
            String str=ops[i];
            switch(str)
            {
                case "D":
                    int n=s.peek();
                    s.push(n*2);
                    break;
                case "C":
                    s.pop();
                    break;
                case "+":
                    int la=s.pop();
                    int sum=la+s.peek();
                    s.push(la);
                    s.push(sum);
                    break;
                default :
                    s.push(Integer.parseInt(str));
                    break;
            }

        }
        int sum=0;
        for(int i:s)
        {
            sum+=i;
        }
        return sum;
    }
    
}
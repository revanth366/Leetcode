class Solution {
    public String makeGood(String str) {
        ArrayDeque<Character> s=new ArrayDeque<>();
        for(char ch:str.toCharArray())
        {
            // char c=s.peek();
            if(!s.isEmpty()&&Math.abs(ch-s.peek())==32)
            {
                s.pop();
            }
            else
            {
                s.push(ch);
            }
        }
        String r="";
        for(char ch:s)
        {
            r+=ch;
        }
        return new StringBuilder(r).reverse().toString();
    }
}
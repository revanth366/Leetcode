class Solution {
    public String removeDuplicates(String str) {
        ArrayDeque<Character> s=new ArrayDeque<>();
        for(char ch:str.toCharArray())
        {
            if(!s.isEmpty()&&s.peek()==ch)
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
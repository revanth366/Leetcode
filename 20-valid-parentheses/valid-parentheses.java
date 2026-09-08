class Solution {
    public boolean isValid(String str) {
        ArrayDeque<Character> s=new ArrayDeque<>();
        for(char ch:str.toCharArray())
        {
            // if(ch=='('||ch=='['||ch=='{')
            // {
            //     s.push(ch);
            // }
            // else
            // {
            
                if(ch==')'&& !s.isEmpty()&&s.peek()=='(')
                {
                    s.pop();
                }
                else if(ch==']'&&!s.isEmpty()&&s.peek()=='[')
                {
                    s.pop();
                }
                else if(ch=='}'&&!s.isEmpty()&&s.peek()=='{')
                {
                    s.pop();
                }
                else s.push(ch);
            // }
        }
        return s.isEmpty();
    }
}
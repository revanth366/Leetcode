class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> M= new HashMap<>();
        for(char ch : s. toCharArray())
        {
            if(M.containsKey(ch))
            {
                return ch;
            }
            M.put(ch,1);
        }
        return ' ';
    }
}
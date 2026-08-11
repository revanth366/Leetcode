class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<>();
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
        for (char ch : p.toCharArray()) {
            m1.put(ch, m1.getOrDefault(ch, 0) + 1);
        }

        int n = s.length();
        int i = 0;

        for (int j = 0; j < n; j++) {
            char ch = s.charAt(j);
            m2.put(ch, m2.getOrDefault(ch, 0) + 1);
            if (j >= p.length() - 1) {
                if (m1.equals(m2)) {
                    l.add(i);
                }
                char left = s.charAt(i);

                m2.put(left, m2.get(left) - 1);

                if (m2.get(left) == 0) {
                    m2.remove(left);
                }

                i++;
            }
        }
        return l;
    }
}
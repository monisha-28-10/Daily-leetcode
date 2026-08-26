class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split("\\s+");
        if(pattern.length()!=s1.length){
            return false;
        }
        Map<Character, String> m1 = new HashMap<>();
        Set<String> m2 = new HashSet<>();

        for (int i=0;i<pattern.length();i++) {
            char c1 = pattern.charAt(i);
            String c2 = s1[i];

            if (m1.containsKey(c1)) {
                if (!m1.get(c1).equals(c2)) return false;
            } else {
                if (m2.contains(c2)) return false;
                m1.put(c1, c2);
                m2.add(c2);
            }
        }
        return true;
    }
}
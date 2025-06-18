class ques6 {
    public int lengthOfLongestSubstring(String s) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // int left = 0, right = 0, n = s.length(), len = 0;

        // while (right < n) {
        //     if (map.containsKey(s.charAt(right))) {
        //         left = Math.max(left, map.get(s.charAt(right)) + 1);
        //     }
        //     map.put(s.charAt(right), right);

        //     len = Math.max(len, right - left + 1);
        //     right++;
        // }
        // return len;

        int start = 0, len = 0, n = s.length();
        int freq[] = new int[128];

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            start = Math.max(start, freq[ch]);
            freq[ch] = i + 1;
            len = Math.max(len, i - start + 1);
        }

        return len;
    }
}
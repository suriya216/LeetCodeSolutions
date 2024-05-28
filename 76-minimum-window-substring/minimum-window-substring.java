class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        int matchCounter = charCountMap.size();
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (charCountMap.containsKey(rightChar)) {
                charCountMap.put(rightChar, charCountMap.get(rightChar) - 1);
                if (charCountMap.get(rightChar) == 0) {
                    matchCounter--;
                }
            }
            right++;
            while (matchCounter == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    minStart = left;
                }
                char leftChar = s.charAt(left);
                if (charCountMap.containsKey(leftChar)) {
                    charCountMap.put(leftChar, charCountMap.get(leftChar) + 1);
                    if (charCountMap.get(leftChar) > 0) {
                        matchCounter++;
                    }
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
import java.util.HashSet;

public class Solution7 {
    public static void main(String[] args) {
        String s ="pwwkew";
        LongestString solution= new LongestString();
        System.out.println(solution.lengthOfLongestSubstring(s));


    }
}
class LongestString {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}


package String.LongestCommonPrefix;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] test1 = {"flower", "flow", "flight"};
        System.out.println("Result: " + sol.longestCommonPrefix(test1)); // 預期: "fl"
        String[] test2 = {"dog", "racecar", "car"};
        System.out.println("Result: " + sol.longestCommonPrefix(test2)); // 預期: ""
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        // 如果一開始讀取的字串是空的話，那就直接回傳空值
        if (strs == null || strs.length == 0) return "";

        // 1. 拿第一個字串當作初始前綴
        String prefix = strs[0];

        // 2. 從第二個字串開始比對
        for (int i = 1; i < strs.length; i++) {
            // 3. 只要當前字串不包含這個 prefix 在開頭 (index != 0)
            while (strs[i].indexOf(prefix) != 0) {
                // 4. 就把 prefix 的最後一個字元砍掉
                prefix = prefix.substring(0, prefix.length() - 1);

                // 如果砍到沒了，就回傳空字串
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
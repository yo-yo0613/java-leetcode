package String.VaildPalindrome;

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // 測試案例
        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race3 a car";
        String test3 = " ";

        // 執行並印出結果
        System.out.println("Text 1 (\"" + test1 + "\"): " + sol.isPalindrome(test1));
        System.out.println("Text 2 (\"" + test1 + "\"): " + sol.isPalindrome(test2));
        System.out.println("Text 3 (\"" + test1 + "\"): " + sol.isPalindrome(test3));
    }   
}


class Solution {
    public boolean isPalindrome(String s) {
        // 如果字串為空的話，直接回傳 false
        if (s == null) return false;

        // 定義左右指標
        int left = 0;
        int right = s.length() - 1;

        // 進行雙指標檢查
        while (left < right) {
            // 取得左右指標的字元
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            // 1. 處理左邊：如果不是字母或數字就跳過
            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            }


            else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            }

            else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
        }

        return true;
    }
}
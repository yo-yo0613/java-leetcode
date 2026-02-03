package ArrayAndHashMap.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums1)); // true

        int[] nums2 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums2)); // false

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(solution.containsDuplicate(nums3)); // true
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 1. 初始化一個儲存 Integer 的 HashSet
        Set<Integer> set = new HashSet<>();

        // 2. 使用 for-each 迴圈遍歷 nums
        for (int num : nums) {
            // 3. 檢查 set 是否已經包含這個數字
            if (set.contains(num)) {
                // 如果包含，代表重複了，直接回傳 true
                return true;
            } else {
                // 4. 如果不包含，將數字加入 set
                set.add(num);
            }
        }

        // 5. 走完迴圈都沒發現重複，回傳 false
        return false;
    }
}
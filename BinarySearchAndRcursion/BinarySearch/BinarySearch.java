package BinarySearchAndRcursion.BinarySearch;

public class BinarySearch {
    
}

class Solution {
    public int search(int[] nums, int target) {
        // 左指針
        int left = 0;
        // 右指針
        int right = nums.length - 1;

        while (left <= right) {
            // 優雅的 mid 計算方式，防止 (left + right) 超過 Integer.MAX_VALUE
            int mid = left + (right - left) / 2;
            
            // 如果找到目標值，返回索引
            if (nums[mid] == target) {
                return mid; // 返回目標值的索引
            } else if (nums[mid] < target) {
                left = mid + 1; // 往右半邊找
            } else {
                right = mid - 1; // 往左半邊找
            }
        }

        return -1; // 沒找到
    }
}
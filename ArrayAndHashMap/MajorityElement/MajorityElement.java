package ArrayAndHashMap.MajorityElement;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] argv) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 3};
        int result = solution.majorityElement(nums);
        System.out.println(result); // 輸出: 3

        int[] nums2 = {2,2,1,1,1,2,2};
        int result2 = solution.majorityElement(nums2);
        System.out.println(result2); // 輸出: 2
    }    
}

class Solution {
    int majorityElement(int[] nums) {
        // 使用 HashMap 紀錄每個元素出現的次數
        Map<Integer, Integer> counts = new HashMap<>();
        // 取得陣列長度
        int n = nums.length;

        // 遍歷陣列 for each 
        for (int num : nums) {
            // getOrDefault(key, defaultValue): 如果 key 不存在，就給 0
            // 將當前的元素出現次數加 1
            int count = counts.getOrDefault(num, 0) + 1;

            // 如果次數超過一半，直接回傳
            if (count > n / 2) {
                return num;
            }
            
            // 更新 HashMap 中該元素的次數
            counts.put(num, count);
        }
        return -1; // 理論上不會執行到這裡

    }
}

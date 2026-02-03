package ArrayAndHashMap.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = sol.twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // 預期輸出: [0, 1]
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 1. 初始化 HashMap (Key: 數值, Value: 索引)
        Map<Integer, Integer> map = new HashMap<>();

        // 2. 開始遍歷陣列
        for (int i = 0; i < nums.length; i++) {
            // 計算補數
            int complement = target - nums[i];
            
            // 3. 檢查補數是否存在
            if (map.containsKey(complement)) {
                // 如果存在，回傳結果陣列
                return new int[] { map.get(complement), i };
            }
            
            // 4. 如果不存在，將當前數字存入 map
            map.put(nums[i], i);
        }
    
        // 如果沒找到（題目保證有解，所以這行通常不會執行）
        throw new IllegalArgumentException("No two sum solution");
    }
}

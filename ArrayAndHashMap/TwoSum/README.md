# LeetCode 001. Two Sum

### 題目說明
給定一個整數陣列 `nums` 和一個目標值 `target`，請找出和為目標值的兩個整數下標。

### 核心知識點 (Java)
1. **HashMap**: 
   - `containsKey(key)`: 檢查數值是否出現過 ($O(1)$ 效率)。
   - `get(key)`: 取得該數值的索引。
   - `put(key, value)`: 儲存數值與索引。
2. **陣列初始化**: `new int[] { index1, index2 }` 用於快速回傳結果。

### 解題邏輯
- **暴力法**: 雙層迴圈 $O(n^2)$。
- **優化法 (Hash Table)**: 
    - 遍歷陣列時，計算「還差多少」(target - nums[i])。
    - 檢查「差額」是否在 Map 中，有則回傳，無則存入 Map。
    - 時間複雜度: $O(n)$。
    - 空間複雜度: $O(n)$。

### 常見錯誤
- 忘記 `import java.util.HashMap;`。
- 泛型宣告錯誤：`Map<int, int>` 是錯的，必須用包裝類別 `Map<Integer, Integer>`。
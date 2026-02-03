# LeetCode 169. Majority Element

### 核心知識點 (Java)
1. **Map.getOrDefault(key, defaultValue)**:
   - 這是 Java 8 引入的超方便方法。
   - 解決了以前需要先 `containsKey` 判斷，再 `get` 的冗長步驟。
2. **整數除法**: `n / 2` 在 Java 中會自動無條件捨去（Floor）。

### 進階思維：摩爾投票法 (Boyer-Moore)
- 設置一個 `candidate` (候選人) 和 `count` (票數)。
- 遍歷陣列：
    - 如果 `count == 0`，就換人當候選人。
    - 如果當前數字 == `candidate`，`count++`；否則 `count--`。
- 最終的 `candidate` 即為答案。
- **優點**: 不需要額外空間 $O(1)$，效率極高。
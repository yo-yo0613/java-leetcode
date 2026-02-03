# LeetCode 020. Valid Parentheses

### 核心知識點 (Java)
1. **Deque / ArrayDeque**:
   - Java 中實作 Stack 的推薦方式。
   - `push()`: 壓入元素。
   - `pop()`: 彈出並回傳最上方的元素。
   - `isEmpty()`: 檢查堆疊是否為空。
2. **toCharArray()**:
   - 將 `String` 轉換為 `char[]`，讓 `for-each` 遍歷更簡潔。

### 解題邏輯
- **後進先出 (LIFO)**: 最近出現的左括號必須最先被閉合。
- **匹配檢查**: 
    - 遇到左括號，預存對應的右括號。
    - 遇到右括號，與 Stack 頂端進行比對。
- **時間複雜度**: $O(n)$。
- **空間複雜度**: $O(n)$ (最差情況下所有字元都是左括號)。

### 為什麼不用 java.util.Stack?
- `Stack` 繼承自 `Vector`，它是同步的（Thread-safe），在單執行緒下效能較差。`ArrayDeque` 是更現代、效能更好的選擇。
# LeetCode 014. Longest Common Prefix

### 核心知識點 (Java)
1. **String.indexOf(String str)**:
   - 回傳子字串在母字串中第一次出現的索引。
   - 在本題中，我們關心的是結果是否等於 `0` (代表在開頭)。
2. **String.substring(int beginIndex, int endIndex)**:
   - 擷取字串。注意 `endIndex` 是 **不包含 (Exclusive)** 的。
   - `prefix.substring(0, n - 1)` 是砍掉最後一個字元的常用寫法。

### 解題策略
- **水平掃描**: 像滾動的橡皮擦一樣，不斷縮小基準字串直到符合所有條件。
- **時間複雜度**: $O(S)$，S 是所有字串中字元的總和。
- **空間複雜度**: $O(1)$。

### 常見錯誤
- **strs 為空**: 務必先判斷 `strs.length == 0`，否則存取 `strs[0]` 會報 `ArrayIndexOutOfBoundsException`。